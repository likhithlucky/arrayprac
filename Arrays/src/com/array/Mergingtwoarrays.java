package com.array;

import java.util.Arrays;

public class Mergingtwoarrays {

	public static void main(String[] args) {
		int arr1[]= {3,4,5,6,7};
		int[] arr2= {8,9,10,11};
		int l1=arr1.length;
		int l2=arr2.length;
		int l3=l1+l2;
		int[] output=new int[l3];
		System.arraycopy(arr1, 0, output, 0, l1);
		System.arraycopy(arr2, 0, output, l1,l2);
		//System.arraycopy(src, srcPos, dest, destPos, length);
   System.out.println(Arrays.toString(output));
	}

}
