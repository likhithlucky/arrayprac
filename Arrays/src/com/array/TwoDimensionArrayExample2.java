package com.array;

public class TwoDimensionArrayExample2 {

	public static void main(String[] args) {
		int[] [] arr=new int[2] [2];
		arr[0][0]=4;
		arr[0][1]=5;
		arr[1][0]=6;
		arr[1][1]=7;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
