package com.array;

public class Addtwodimarrayexample2 {

	public static void main(String[] args) {
		int[][] a= {{3,4},{6,5}};
		int[][] b= {{7,4},{5,9}};
		int[][] c= new int[2][2];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
