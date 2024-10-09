package com.dest.basicsOfProgramming.variables;

import java.util.Scanner;

class ArrayMul {
    int mat1[][],mat2[][],res[][];
    int size;
    Scanner sc = new Scanner(System.in);

    void createMatrix() {
        System.out.println("Creating the matrices..");
        System.out.println("Enter the size of the matrices");
        size = sc.nextInt();
        mat1 = new int[size][size];
        System.out.println("Matrix - 1 is created");
        mat2 = new int[size][size];
        System.out.println("Matrix - 2 is created");
        System.out.println("========================");
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
        System.out.println("Collecting data for Matrix - 2");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix - 2 data is collected");
        System.out.println("=============================");
    }

    void multiplication() {
        res = new int[size][size];
        System.out.println("Resultant matrix is ready for collecting the multiplication result..");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                res[i][j] = 0;
                for (int k = 0; k < size; k++) {
                    res[i][j] = res[i][j] + (mat1[i][k] * mat2[k][j]);  // Fixed the multiplication logic here
                }
            }
        }
        System.out.println("Result is collected into the resultant matrix");
        System.out.println("=============================");
    }

    void display() {
        System.out.println("Displaying the resultant Matrix");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class ArrayMultiplication {

    public static void main(String[] args) {
        ArrayMul a = new ArrayMul();
        a.createMatrix();
        a.collectingDataForMatrices();
        a.multiplication();
        a.display();
    }
}
