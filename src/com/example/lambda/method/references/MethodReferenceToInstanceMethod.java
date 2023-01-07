package com.example.lambda.method.references;

import java.util.Arrays;
import java.util.function.Function;

public class MethodReferenceToInstanceMethod {

	//Reference to the instance method of an arbitrary object Sometimes, we call a 
	//method of argument in the lambda expression.
	//In the case, we can use a method reference to call an instance method of
	//an arbitrary object of a specific type.
	
	//lambda expression
	public static void main(String[] args) {
		Function<String,String> function = (input)-> input.toLowerCase();
		System.out.println(function.apply("HELLO WORLD!"));
		
		//using method reference
		
		Function<String,String> functionMethodRef = String::toLowerCase;
		System.out.println(functionMethodRef.apply("HELLO WORLD!"));
		
		String[] strArray= {"a","e","i","o","u","A","E","I","O","U"};
		
		Arrays.sort(strArray, (s1,s2)->s1.compareToIgnoreCase(s2));
		
		Arrays.sort(strArray,String::compareToIgnoreCase);
		
	}
	
}
