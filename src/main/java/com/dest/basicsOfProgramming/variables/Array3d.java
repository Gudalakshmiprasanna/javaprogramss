package com.dest.basicsOfProgramming.variables;
import java.util.Scanner;

class Array3dOps{
	int clg;
	int cls;
	int stu;
	int arr[][][];
	Scanner sc = new Scanner(System.in);
	void createArray() {
		System.out.println("Array creation initiated");
		System.out.println("Enter College count");
		clg = sc.nextInt();
		System.out.println("Enter the class count");
		cls = sc.nextInt();
		System.out.println("Enter the student count in each class");
		stu = sc.nextInt();
		arr = new int[clg][cls][stu];
		System.out.println("Array is created");
		System.out.println("================");
	}
	void collectData() {
		System.out.println("Collecting data");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the clg no "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside class no "+ (j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the marks of student no"+ (k+1));
				
				arr[i][j][k] = sc.nextInt();
				}
			}
		}
	}
	void displayData() {
		System.out.println("Displaying the student data");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the clg no "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(" Inside class no "+ (j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("the marks of student no"+ (k+1)+" are "+arr[i][j][k]);
				}
			}
		}
	}
}
public class Array3d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array3dOps a = new Array3dOps();
		a.createArray();
		a.collectData();
		a.displayData();

	}

}
