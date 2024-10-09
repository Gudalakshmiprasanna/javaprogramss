package com.dest.basicsOfProgramming.variables;
class Dog1{
	String name;
	int age;
	String color;
	int cost;
	String breed;
	void setName(String a) {
		name = a;
	}
	void setAge(int b) {
		age = b;
	}
	void setColor(String c) {
		color = c;
	}
	void setCost(int d) {
		cost = d;
	}
	void setBreed(String e) {
		breed = e;
	}
	String getName() {
		return name;
	}
	int getage() {
		return age;
	}
	String getColor() {
		return color;
	}
	int getcost() {
		return cost;
	}
	String getBreed() {
		return breed;
	}
	
}


public class EncapsulationCode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 d = new Dog1();
		d.setName("Bittu");
		d.setAge(4);
		d.setColor("White");
		d.setCost(5600);
		d.setBreed("Pug");
		System.out.println(d.getage()+" "+ d.getBreed());
		

	}

}
