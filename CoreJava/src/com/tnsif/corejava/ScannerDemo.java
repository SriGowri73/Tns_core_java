package com.tnsif.corejava;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// using scanner method to take input
		Scanner s=new Scanner(System.in);
		
		String s1=s.nextLine(); //input string i taken from the previous 
		System.out.println("Entered string:"+s1);
		
		int a=s.nextInt();  //take input int 
		System.out.println("Entered integer:"+a);
		
		float b=s.nextFloat(); //take input float and assigns to var b
		System.out.println("Entered float:"+b);
		
		s.close();

	}

}
