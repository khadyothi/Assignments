package com.sonata;

public class Reversearray {
	public static void main(String [] args) {
		int[] array= {1,2,3,4,5,6,7};
		System.out.println("Reverse of an array");
		for(int i=array.length-1;i>=0;i--)
		{
			System.out.println(array[i]);
		}
	}

}
