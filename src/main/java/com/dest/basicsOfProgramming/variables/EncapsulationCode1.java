package com.dest.basicsOfProgramming.variables;
class Dog{
	String name;
	int age;
	String color;
	int cost;
	String breed;
	
	void setData(String a, int b, String c,int d,String e) {
		name = a;
		age = b;
		color = c;
		cost = d;
		breed = e;
	}
	void getData() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(breed);
	}
}

public class EncapsulationCode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.setData("Rocky", 3, "Black", 5000, "pug");
		d.getData();
	}

}
