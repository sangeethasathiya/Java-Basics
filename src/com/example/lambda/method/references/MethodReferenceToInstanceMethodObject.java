package com.example.lambda.method.references;

interface Printable{
	String print(String msg);
}
public class MethodReferenceToInstanceMethodObject {
	String display(String msg) {
		msg=msg.toUpperCase();
		return msg;
	}
	public static void main(String[] args) {
		//Lambda Expression
		MethodReferenceToInstanceMethodObject methodReferenceToInstanceMethodObject = new MethodReferenceToInstanceMethodObject();
		Printable printable = (msg)-> methodReferenceToInstanceMethodObject.display(msg);
		System.out.println(printable.print("hellooo"));
		
		//Method Reference to an instance method of an object
		Printable printableMethodRef = methodReferenceToInstanceMethodObject::display;
		System.out.println(printableMethodRef.print("baby"));
	}
}
