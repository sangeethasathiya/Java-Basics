package com.example.lambda.method.references;

import java.util.function.BiFunction;
import java.util.function.Function;

//Traditional way

class BiFunctionImpl implements BiFunction<Integer, Integer, Integer>{

	@Override
	public Integer apply(Integer t, Integer u) {
		
		return Addition.add(t, u);
	}
	
}

class Addition{
	public static Integer add(Integer a, Integer b) {
		return (a+b);
	}
}
public class MethodReferenceToStaticMethod {
	public static void main(String[] args) {
		
		//using Lambda expression
		Function<Integer , Double> functionExample = (input)-> Math.sqrt(input);
		System.out.println(functionExample.apply(4));
		
		//Method References to Static method
		
		Function<Integer , Double> functionExample1 = Math::sqrt;
		System.out.println(functionExample1.apply(16));
		
		//Traditional way
		BiFunction<Integer, Integer, Integer> biFunction = new BiFunctionImpl();
		System.out.println(biFunction.apply(30, 40));
		
		//using Lambda expression
		
		BiFunction<Integer, Integer, Integer> biFunctionExample = (a,b)->Addition.add(a, b);
		System.out.println(biFunctionExample.apply(10, 50));
		
		//Method References to Static method
		BiFunction<Integer, Integer, Integer> biFunctionExample1 = Addition::add;
		System.out.println(biFunctionExample1.apply(100, 50));
	}
}
