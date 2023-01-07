package com.example.demo;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String value : ");
		System.out.println("Next method "+ sc.next());
		System.out.println("NextLine method "+ sc.nextLine());
		System.out.println("NextInt method "+ sc.nextInt());
		System.out.println("NextFloat method "+ sc.nextFloat());
		System.out.println("NextDouble method "+ sc.nextDouble());
		System.out.println("NextBigInteger method "+ sc.nextBigInteger());
		System.out.println("NextBigDecimal method "+ sc.nextBigDecimal());
		System.out.println("NextByte method "+ sc.nextByte());
		sc.close();
	}

}
