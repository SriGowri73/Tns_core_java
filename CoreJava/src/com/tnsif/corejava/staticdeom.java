package com.tnsif.corejava;

public class staticdeom {

	static int a=50; //static variable
	int b=30; //instance variable
	
	static String s="New day!!"; //static variable
	
	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println("What a "+ s);
	}
	
	//static method
	static void staticdisplay() {
		System.out.println(a);
	}
	//non static method 
	void nonstaticdisplay() {
		staticdisplay(); //static method can be accessed by non static method
	}


	public static void main(String[] args) {
		staticdeom obj=new staticdeom();
		obj.display();
		staticdisplay(); //calling static method
		System.out.println("Non-static display:"); 
		obj.nonstaticdisplay();

	}

}
