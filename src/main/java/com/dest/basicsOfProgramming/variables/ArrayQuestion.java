package com.dest.basicsOfProgramming.variables;

import java.util.Scanner;

public class ArrayQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of items you want to purchase");
		int items = sc.nextInt();
		int arr[] = new int[items];
		int totalExpenses = 0;
		
		for(int i=0;i<items;i++) 
		{
		System.out.println("Enter the price of item "+ (i+1));
		arr[i] = sc.nextInt();
		totalExpenses += arr[i];
		}
		System.out.println("Enter the number of persons want to invest");
		int personsCount = sc.nextInt();
		
		System.out.println("Enter the amount each person invests");
		int personInvest = sc.nextInt();
		
		int totalInvestment = personsCount * personInvest; 
		
		if( totalExpenses < totalInvestment) {
			System.out.println("Expenses is not overloaded than budget");
		}
		else {
			System.out.println("Expenses overloaded");
		}
		

	}

}
