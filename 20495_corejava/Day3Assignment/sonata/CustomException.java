package com.sonata;

public class CustomException{
	

	public static void main(String args[]) throws OwnException{
	
        double total=2000000;
		if(total<100000)
		{
			throw new OwnException("No tax");
		}
		else {
			System.out.println("Tax is Mandatory");
		}
	}
}
