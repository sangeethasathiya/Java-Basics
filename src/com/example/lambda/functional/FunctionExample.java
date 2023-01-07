package com.example.lambda.functional;

import java.util.function.Function;

//Traditional way
class MyFunctionalInterfaceImpls implements Function<String, Integer>{

@Override
public Integer apply(String t) {	
	return t.length();
}
}

public class FunctionExample {
	public static void main(String[] args) {
		
		//Traditional way
		Function<String, Integer> myFunctionInterface = new MyFunctionalInterfaceImpls();
		System.out.println(myFunctionInterface.apply("Sangeetha"));
		
		//Using Lambda expression
		Function<String, Integer> myFunctionInterface1 = (t)->t.length();
		System.out.println(myFunctionInterface1.apply("Baby Bro"));
	}
}

