package com.example.lambda;

interface Addable{
	int addition(int a, int b);
}

//Tradition way

class AddableImpl implements Addable{

	@Override
	public int addition(int a, int b) {
		return a+b;
	}
	
}
public class LambdaParameterExample {
	
	public static void main(String[] args) {
		Addable addable = new AddableImpl();
		int c = addable.addition(45, 54);
		System.out.println(c);
		//1st implementation- not to follow this
		Addable add =(int a, int b)-> {
			return a+b;
		};
		System.out.println(add.addition(87,98));
		
		//optimized 
		Addable additionObj = (a,b)->(a+b);
		System.out.println(additionObj.addition(7,8));
	
		//Simply tried
		Addable obj = (a,b)->{
			int d = a+b;
			return d;
		};
	obj.addition(4, 6);
	}
	
	
	}
	

