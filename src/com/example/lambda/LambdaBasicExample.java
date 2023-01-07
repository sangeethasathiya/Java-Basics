package com.example.lambda;

//Functional Interface
interface Shape{
	void draw(); // by default - this method will be public default so need to add public default
}

//Traditional way to implement an interface

class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Class Rectangle implemented Shape Class.");		
	}	
	
}

class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Class Circle implemented Shape Class.");	
	}
	
}

class Triangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Class Triangle implemented Shape Class.");	
		
	}
	
}

public class LambdaBasicExample {
	public static void main(String[] args) {
		/* Traditional way to create object
		 * Shape rectangle = new Rectangle(); //Rectangle rectangle = new Rectangle();
		 * both are valid to create and access an object rectangle.draw();
		 */
		
	//Using Lambda expression
		System.out.println("Using Lambda expression\n");
		Shape rectangle = ()->{
			System.out.println("Class Rectangle implemented Shape Class using lambda Expression.");
		};
		rectangle.draw();
		
		Shape circle = ()->System.out.println("Class Circle implemented Shape Class using lambda Expression.");
		circle.draw();
		
		Shape triangle = ()->System.out.println("Class Triangle implemented Shape Class using lambda Expression.");
		triangle.draw();
		
		//Passing Lambda expression to method
		
		System.out.println("\nPassing Lambda expression to method\n");
		print(rectangle);
		print(circle);
		print(triangle);
		
		//We can also directly pass behavior to method
		
		System.out.println("\nWe can also directly pass behavior to method\n");
		print(()->{System.out.println("Class Rectangle implemented Shape Class using lambda Expression.");});
		
		print(()->System.out.println("Class Circle implemented Shape Class using lambda Expression."));
		
		print(()->System.out.println("Class Triangle implemented Shape Class using lambda Expression."));
	}
	
	private static void print(Shape shape) {
		shape.draw();
	}
}
