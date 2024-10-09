package com.dest.basicsOfProgramming.variables;

import java.util.Scanner;

class ArrayOps
{
	int mat1[][];
	int mat2[][];
	int res[][];
	int size;
	Scanner sc =  new Scanner(System.in);
	void createArray() {
		System.out.println("Creating the matrices..");
		System.out.println("Enter the size of the matrices");
		size = sc.nextInt();
		mat1 = new int[size][size];
		System.out.println("Matrix - 1 is created");
		mat2 = new int[size][size];
		System.out.println("Matrix - 2 is created");
		System.out.println("========================");
	}
	void collectingDataForMatrices()
	{
		System.out.println("Collecting data for Matrix -1");
		for(int i=0; i<size; i++) {
			for(int j=0;j<size; j++) {
				mat1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix - 1 data is collected");
		System.out.println("=============================");
		System.out.println("Collecting data for Matrix - 2");
		for(int i=0; i<size; i++) {
			for(int j=0;j<size; j++) {
				mat2[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix - 2 data is collected");
		System.out.println("=============================");
		
	}
	void addition()
	{
		res = new int[size][size];
		System.out.println("Resultant matrix is ready for collecting the sum..");
		for(int i=0; i<size; i++) {
			for(int j=0;j<size; j++) {
				res[i][j] = mat1[i][j] + mat2[i][j] ;
			}
		}
		System.out.println("Result is collected into the resultant matrix");
		System.out.println("=============================");
		
	}
	void display()
	{
		System.out.println("Displaying the resultant Matrix");
		System.out.println("Resultant matrix is ready for collecting the sum..");
		for(int i=0; i<size; i++) {
			for(int j=0;j<size; j++) {
				System.out.print(res[i][j]+ " ");
			}
			System.out.println();
		}
	}
}

public class ArrayAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOps a = new ArrayOps();
		a.createArray();
		a.collectingDataForMatrices();
		a.addition();
		a.display();
		
	}

}
