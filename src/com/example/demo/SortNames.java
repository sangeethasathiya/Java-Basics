package com.example.demo;

import java.util.Scanner;

public class SortNames {

	public static void main(String[] args) {
		int n;
		String temp;
		System.out.print("Enter the number of values to be sorted : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.print("\nEnter "+ n + " value to be sorted");
		Scanner sc1 = new Scanner(System.in);
		String[] names = new String[n];	
		for(int i =0; i<n;i++) {
			names[i]=sc1.nextLine();
		}
		System.out.println("Sorted value:");
		for(int i =0;i<n;i++) {
			for(int j =i+1;j<n;j++) {
				if(names[i].compareToIgnoreCase(names[j])> 0) {					
				temp=names[i];
				names[i]=names[j];
				names[j]=temp;
				}
			}
		}
		for(String name : names)
			System.out.print(name+" ");
		sc.close();
		sc1.close();
	}

}
