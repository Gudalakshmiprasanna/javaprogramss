package com.dest.basicsOfProgramming.variables;

import java.util.Scanner;

class MatrixOps{
	int mat1[][];
    int size;
    Scanner sc = new Scanner(System.in);

    void createArray() {
        System.out.println("Creating the matrices..");
        System.out.println("Enter the size of the matrices");
        size = sc.nextInt();
        mat1 = new int[size][size];
        System.out.println("Matrix - 1 is created");
    }

    void collectingDataForMatrices() {
        System.out.println("Collecting data for Matrix - 1");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix - 1 data is collected");
        System.out.println("=============================");
    }
    void checkIdentity() {
    	for(int i=0;i<size;i++) {
    		for(int j=0;j<size;j++) {
    			if(i==j) 
    			{
    				if(mat1[i][j] != 1) {
    					System.out.println("The given matrix is not identity matrix");
    					System.exit(0);
    				}
    			}
    			else {
    					if(mat1[i][j] != 0) {
    						System.out.println("The given matrix is not identity matrix");
    						System.exit(0);
    					}
    				}
    		}
    	}
    	System.out.println("The given matrix is a identity matrix");
    }
}
public class IdentityMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrixOps mo = new MatrixOps();
		mo.createArray();
		mo.collectingDataForMatrices();
		mo.checkIdentity();

	}

}
