package com.example.lambda.method.references;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class MethodReferenceToConstructor {
	public static void main(String[] args) {
		
		//using lambda expression
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("WaterMelon");
		fruits.add("Banana");
		
		Function<List<String>, Set<String>> function = (f)->new HashSet<>(f);
		System.out.println(function.apply(fruits));
		
		//using method Reference
		
		Function<List<String>, Set<String>> functionMethodReference = HashSet::new;
		System.out.println(functionMethodReference.apply(fruits));
	}
}
