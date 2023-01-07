package com.example.lambda.functional;

import java.util.function.Supplier;

//Traditional way

class SupplierImpl implements Supplier<String>{
	@Override
	public String get() {
		// TODO Auto-generated method stub
		return "Happy Birthday";
	}
}


public class SupplierExample {
	public static void main(String[] args) {
		//Traditional way
		Supplier<String> supplier = new SupplierImpl();
		System.out.println(supplier.get());
		
		//Using lambda Expression
		
		Supplier<String> supplierExample =()->{
			return "Happy Birthday";		
		};
		
		System.out.println(supplierExample.get());
		
		Supplier<String> supplierExample1 =()->"Happy Birthday";
		System.out.println(supplierExample1.get());
	}

}


