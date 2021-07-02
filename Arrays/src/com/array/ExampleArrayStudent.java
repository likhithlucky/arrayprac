package com.array;

public class ExampleArrayStudent {

	public static void main(String[] args) {
		Student arr[]=new Student[3];
		arr[0]=new Student(1,"likhi","bangalore");
		arr[1]=new Student(2,"lucky","bangalore");
		arr[2]=new Student(3,"smitha","bangalore");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].roll_no+" " +arr[i].name+" " +arr[i].address);
		}

	}

}
