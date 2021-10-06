package com.sonata;

public class MaxRepetingElement {
	public static void main(String [] args) {
		int [] array= {1,2,3,4,3,3,4,2,2,1,1,1,1,1};
		int count=0;
		int element=0;
		for(int i=0;i<array.length;i++)
		{
			int counter=1;
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					counter++;
				}
			}
			if(count<counter)
			{
				count=counter;
				element=array[i];
			}
		}
		System.out.println("The element which is repeting maximum times is "+ element+ "In "+count+" Times.");
	}

}
