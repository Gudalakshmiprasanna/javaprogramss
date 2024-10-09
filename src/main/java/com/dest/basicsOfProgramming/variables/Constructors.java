package com.dest.basicsOfProgramming.variables;
class Dogg{
	private String name;
	private String color;
	private int age;
	private int cost;
	private String breed;
	
	public Dogg() {
		super();
		System.out.println("Values after executing 0 parametrized constructor");
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(breed);
		System.out.println("===========================");
	}
	
	public Dogg(String name) {
		this("Tommy","Yellow");
		this.name = name;
		System.out.println("Values after executing 1 parametrized constructor");
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(breed);
		System.out.println("===========================");
	}
	
	public Dogg(String name,String color) {
		this("Rocky","Brown",7000);
		this.name = name;
		this.color = color;
		System.out.println("Values after executing 2 parametrized constructor");
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(breed);
		System.out.println("===========================");
	}
	
	public Dogg(String name,String color,int cost) {
		this("Shocky","Black",9000,5);
		this.name = name;
		this.color = color;
		this.cost = cost;
		System.out.println("Values after executing 3 parametrized constructor");
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(breed);
		System.out.println("===========================");
	}
	
	public Dogg(String name,String color,int cost,int age) {
		this("Bunty","White",9000,6,"GR");
		this.name = name;
		this.color = color;
		this.cost = cost;
		this.age = age;
		System.out.println("Values after executing 4 parametrized constructor");
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(breed);
		System.out.println("===========================");
	}
	
	public Dogg(String name,String color,int cost,int age,String breed) {
		this();
		this.name = name;
		this.color = color;
		this.cost = cost;
		this.age = age;
		this.breed = breed;
		System.out.println("Values after executing 5 parametrized constructor");
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(breed);
		System.out.println("===========================");
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getAge() {
		return age;
	}

	public int getCost() {
		return cost;
	}

	public String getBreed() {
		return breed;
	}
	
}

public class Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogg d = new Dogg("Vicky");
		
		System.out.println(d.getName()+ " "+d.getColor()+" "+d.getCost()
		+" "+d.getAge()+" "+d.getBreed());

	}

}
