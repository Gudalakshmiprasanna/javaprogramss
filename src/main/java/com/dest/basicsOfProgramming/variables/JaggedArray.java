package com.dest.basicsOfProgramming.variables;

import java.util.Scanner;

class ArrayjaggedOps{
	int stu;
	int cls;
	String arr[][];
	Scanner sc = new Scanner(System.in);
	void createArray() {
		System.out.println("Array creation initiated");
		System.out.println("Enter the class count");
		cls = sc.nextInt();
		arr = new String[cls][];
		//initiating jagged array
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the student count inside class no "+(i+1));
			stu = sc.nextInt();
			arr[i] = new String[stu];
		}
		System.out.println("Array is created");
		System.out.println("================");
	}
	void collectData() {
		System.out.println("Collecting data");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the class no "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the names of students no "+ (j+1));
				arr[i][j] = sc.next();
			}
		}
	}
	void displayData() {
		System.out.println("Displaying the student data");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the class no "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the names of students no "+ (j+1)+"is "+ arr[i][j]);
				
			}
		}
	}
}
public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayjaggedOps a = new ArrayjaggedOps();
		a.createArray();
		a.collectData();
		a.displayData();

	}

}
