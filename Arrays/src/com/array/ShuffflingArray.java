package com.array;
import java.util.Arrays;
import java.util.Random;

public class ShuffflingArray {

	public static void main(String[] args) {
		int[] arr= {9,4,6,7,3,4,9};
		Random rand=new Random();
		for(int i=0;i<arr.length;i++)
		{
			int r=rand.nextInt(arr.length);
			int temp=arr[r];
			arr[r]=arr[i];
			arr[i]=temp;
		}
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
