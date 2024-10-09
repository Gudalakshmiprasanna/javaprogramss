package com.dest.basicsOfProgramming.variables;
class Dog2{
	private String name;
	private int age;
	private String color;
	private int cost;
	private String breed;
	void setData(String name, int age, String color,int cost,String breed) {
		this.name = name;
		this.age = age;
		this.color = color;
		this.cost = cost;
		this.breed = breed;
	}
	void getData() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(breed);
	}
	void setName(String name) {
		this.name = name;
	}
	void setAge(int age) {
		this.age = age;
	}
	void setColor(String color) {
		this.color = color;
	}
	void setCost(int cost) {
		this.cost = cost;
	}
	void setBreed(String breed) {
		this.breed = breed;
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


public class ThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog2 d = new Dog2();
		d.setData("Rocky", 4, "Black", 3000, "pug");
		d.getData();
		
		Dog2 d1 = new Dog2();
		d1.setName("Bittu");
		d1.setAge(9);
		d1.setColor("White");
		d1.setCost(2000);
		d1.setBreed("pug");
		
		System.out.println(d1.getName()+ " " + d1.getage() +" " +d1.getColor()
		+" "+ d1.getcost() + " "+ d1.getBreed());

	}

}
