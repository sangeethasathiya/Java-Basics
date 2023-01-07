package com.example.lambda.functional;

import java.util.function.Consumer;

//Traditional Way
class ConsumerImpl implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);		
	}
	
}
public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<String> consumer = new ConsumerImpl();
		consumer.accept("Baby");
		
		//Lambda Expression
		
		Consumer<String> consumerObj = (t)->System.out.println(t);
		consumerObj.accept("Sangeetha");
	}
}
