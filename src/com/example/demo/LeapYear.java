package com.example.demo;

public class LeapYear {

	public static void main(String[] arg) {
		String[] args ={"1900","2004","1900"};
		for(int i =0; i<3 ; i++){
		int year = Integer.parseInt(args[i]);
        boolean a = 
        		(((year % 4) == 0) 
        		&& ((year % 100) != 0)) 
        		|| ((year % 400) == 0);
        boolean b = 
        		(year % 4 == 0 
        		&& year % 100 != 0) 
        		|| (year % 400 == 0);
        boolean c = (year % 4 == 0 
        		&& year % 100 != 0) 
        		|| year % 400 == 0;
        boolean d = 
        		year % 4 == 0 
        		&& year % 100 != 0 
        		|| year % 400 == 0;
        boolean e = 
        		((year % 4 == 0)
        				&& (year % 100 != 0)) 
        		|| (year % 400 == 0);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        }
	}
}
