package com.dest.basicsOfProgramming.variables;

import java.util.Scanner;

public class Pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--) {
				System.out.print("- ");
			}
			for(int j=n;j<i;j++) {
			System.out.print("& ");
			}
		
		for(int k=4;k<=n;k++) {
			for(int j=1;j<=i;j++) {
				System.out.print("& ");
			}
		}
		System.out.println();
		}


	}

}
