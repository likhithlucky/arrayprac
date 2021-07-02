package com.array;

public class SumavgofanArray {

	public static void main(String[] args) {
		int[] numbers= {9,2,5,8,1,4,6};
		int sum=0,average;
		//acces all elements using for loop
		//add each element in sum
		for(int n:numbers)
		{
			sum=sum+n;//sum+=n;
		}
		//get total number of elements
		int arraylength=numbers.length;
		average= sum/arraylength;
		System.out.println("sum is : "+sum);
		System.out.println("average is : "+average);
		
		

	}

}
