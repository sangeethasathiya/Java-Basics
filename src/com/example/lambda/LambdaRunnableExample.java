package com.example.lambda;

//Traditional way to implement Runnable

class ThreadRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Run method invoked");
		
	}
	
}

public class LambdaRunnableExample {
	public static void main(String[] args) {
		//Traditional way
		Thread thread = new Thread(new ThreadRunnable());
		thread.start();
		
		//Using lambda expression
		
		Runnable runnableThread = ()->System.out.println("Run method invoked");
		Thread thread1 = new Thread(runnableThread);
		thread1.start();
		
		//optimizing way
		
		Thread thread2 = new Thread(()->System.out.println("Run method invoked"));
		thread2.start();
	}
}
