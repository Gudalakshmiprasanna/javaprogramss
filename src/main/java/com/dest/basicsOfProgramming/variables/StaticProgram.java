package com.dest.basicsOfProgramming.variables;

class SampleCode
{
	static int a,b,c;//static variables
	int p,q,r;//non-static variables
	
	//static block
	static {
		a=10;//static variables accessed by static block
		b=100;
		c=1000;
		
		// p=20;//non-static variables not accessed by static block
		// q=200;
		// r=2000;
	}
	
	//non-static block
	{
		p=25;//non-static variables accessed by non-static block
		q=35;
		r=45;
		
		a=30;//static variables accessed by non-static block
		b=40;
		c=50;
	}
	
	//static method
	static void display() {
		System.out.println(a);//static variables accessed by static method
		System.out.println(b);
		System.out.println(c);
		
		// System.out.println(p);//non-static variables cant be accessed by static method
		// System.out.println(q);
		// System.out.println(r);
	}
	
	//non-static methods
	void display1()
	{
		System.out.println(p);//non-static variables can be accessed by non-static method
		System.out.println(q);
		System.out.println(r);
		
	    System.out.println(a);//static variables can be accessed by non-static method
		System.out.println(b);
		System.out.println(c);
	}
	
	
}
public class StaticProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello from main");
		SampleCode.display();
		System.out.println("**************");
		SampleCode.a = 111;
		SampleCode.b = 222;
		SampleCode.a = 333;
		SampleCode.display();
		System.out.println("*************");
		SampleCode s=new SampleCode();
		s.display1();
		System.out.println("**************");
		s.display();
	}

}
