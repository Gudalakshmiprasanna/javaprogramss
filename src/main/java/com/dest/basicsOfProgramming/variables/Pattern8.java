package com.dest.basicsOfProgramming.variables;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sc.nextInt();
		int count;
		for(int i=1;i<=n;i++)
		{
			count = i;
			for(int j=1;j<=n;j++) {
			System.out.print(count+"	");
			count += 5;
			}
			System.out.println();
		}

	}

}
