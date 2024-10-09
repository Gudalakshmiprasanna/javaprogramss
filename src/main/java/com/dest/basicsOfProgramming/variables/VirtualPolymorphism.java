package com.dest.basicsOfProgramming.variables;
class Calculator{
	int add(int a, int b) {
		return a+b;
	}
	int add(int a, int b,int c) {
		return a+b+c;
	}
	float add(float a, float b) {
		return a+b;
	}
	float add(float a, float b,float c) {
		return a+b+c;
	}
	double add(double a, double b) {
		return a+b;
	}
	double add(double a, double b,double c) {
		return a+b+c;
	}
	float add(int a,float b) {
		return a+b;
	}
	float add(float a,int b) {
		return a+b;
	}


}

public class VirtualPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		System.out.println(c.add(20, 80));
		System.out.println(c.add(20.9f, 80.7f));
		System.out.println(c.add(20345.890, 236.880));
		System.out.println(c.add(20, 80,90f));
		System.out.println(c.add(20.5f, 80.5f,90.8f));
		System.out.println(c.add(2045.8962, 7895.6580,90259.8952));
		System.out.println(c.add(20, 80.90f));
		System.out.println(c.add(20.80f,90));
	}

}
