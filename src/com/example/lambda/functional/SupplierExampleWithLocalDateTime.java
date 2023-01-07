package com.example.lambda.functional;

import java.time.LocalDateTime;
import java.util.function.Supplier;

//Traditional way
class SupplierImpls implements Supplier<LocalDateTime>{

	@Override
	public LocalDateTime get() {
		return LocalDateTime.now();
	}
	
}
public class SupplierExampleWithLocalDateTime {
	public static void main(String[] args) {
		Supplier<LocalDateTime> supplierExample = new SupplierImpls();
		System.out.println(supplierExample.get());
		
		//Using lambda expression
		Supplier<LocalDateTime> supplier = ()->LocalDateTime.MAX;
		
		System.out.println(supplier.get());
	}

}
