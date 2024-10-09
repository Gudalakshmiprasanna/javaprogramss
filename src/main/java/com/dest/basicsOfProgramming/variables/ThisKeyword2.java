package com.dest.basicsOfProgramming.variables;

class Cricketer{
	private String name;
	private int age;
	private String teamname;
	private int runs;
	
	void setData(String name,int age, String teamname,int runs) {
		this.name = name;
		this.age = age;
		this.teamname = teamname;
		this.runs = runs;
	}
	
	void getData() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(teamname);
		System.out.println(runs);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}
	
}

public class ThisKeyword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricketer c = new Cricketer();
		c.setData("Virat", 40, "RCB", 5000);
		c.getData();
		
		Cricketer c1 = new Cricketer();
		c1.setName("Rohit Sharma");
		c1.setAge(45);
		c1.setRuns(6000);
		c1.setTeamname("RCB");
		
		System.out.println(c1.getAge()+ " " + c1.getName()+" "+c1.getRuns()
		+" "+c1.getTeamname());
	}

}
