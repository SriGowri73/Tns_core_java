package com.tnsif.corejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class input_var {

	public static void main(String[] args) throws IOException{
		//using BufferReader class method to take input
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		
		String s=r.readLine();
		System.out.println("Buffer Reader Input:"+s);
		

	}

}
