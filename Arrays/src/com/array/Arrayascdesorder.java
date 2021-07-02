package com.array;

import java.util.Arrays;
import java.util.Collections;

public class Arrayascdesorder {

	public static void main(String[] args) {
		Integer[] a= {5,7,4,3,9,1,0};
		
		Arrays.sort(a);
		System.out.println("Ascending order of an array"+Arrays.toString(a));
		
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("descending order of an array"+Arrays.toString(a));

	}

}
