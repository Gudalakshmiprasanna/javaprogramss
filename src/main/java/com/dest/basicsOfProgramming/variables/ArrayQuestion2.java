package com.dest.basicsOfProgramming.variables;

import java.util.Scanner;

class Array1{
	int arr[];
	int noOfItems;
	int totalExpenses;
	int noOfPersons;
	int budgetEach;
	int totalBudget;
	Scanner sc = new Scanner(System.in);
	void expenses() {
		System.out.println("Enter the number of items:");
		noOfItems = sc.nextInt();
		arr = new int[noOfItems];
		for(int i=0;i<noOfItems;i++) {
		System.out.println("Enter the price of item "+ (i+1));
		arr[i] = sc.nextInt();
		totalExpenses += arr[i];
		System.out.println("The total expenses incured" + totalExpenses);
		}
	}
	void budget()
	{
		System.out.println("Enter the number of persons invested");
		noOfPersons = sc.nextInt();
		System.out.println("Enter each person budget ");
		budgetEach = sc.nextInt();
	}
	void budgetCompare()
	{
		totalBudget = noOfPersons * budgetEach;
		if(totalBudget > totalExpenses) {
			System.out.println("Budget is not overloaded");
		}
		else {
			System.out.println("Budget is overloaded");
		}
	}
		
		
}
public class ArrayQuestion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array1 a1 = new Array1();
		a1.expenses();
		a1.budget();
		a1.budgetCompare();
	}

}
