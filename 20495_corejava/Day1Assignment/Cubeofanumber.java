package com.sonata;

import java.util.Scanner;

public class Cubeofanumber {
	public static void main(String[] args) {
		int i,n;
		System.out.println("THe Input Number is");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		i=n*n*n;
		System.out.println("cube of the given number "+n+" is "+i );
	}

}
