package com.array;

public class AddingTwoDimArrayExample {

	public static void main(String[] args) {
		int[][] matrix1= {{2,3} , {5,6}};
		int[][] matrix2= {{2,3} , {5,6}};
		
		int[][] output= new int[matrix1.length][matrix2[1].length];
		for(int i=0;i<matrix1.length;i++)
		{
			for(int j=0;j<matrix2[1].length;j++)
			{
				output[i][j]=matrix1[i][j]+matrix2[i][j];
				System.out.print(output[i][j]+ " ");
			}
			System.out.println();
		}
		
		
 
	}

}
