package com.array;

public class FindingminmaxinanArray {

	public static void main(String[] args) {
		int[] a= {9,4,5,7};
		int min=a[0],max=a[0];
		for(int i=0;i<a.length;i++)
		{
			 if(max < a[i]){
			        max = a[i];
			      }else if(min > a[i]){
			        min = a[i];
			      }		   		   
		

	}
		System.out.println("min no : " +min+ "\nmax no : " +max);

	}}
