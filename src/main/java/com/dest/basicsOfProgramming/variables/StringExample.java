package com.dest.basicsOfProgramming.variables;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("radha");
		String s2 = new String("krishna");
		s1.concat(s2);//direct changes arent reflected
		s1 = s1.concat(s2);//external push gets them merged
		System.out.println(s1);
		
		StringBuilder sb1 = new StringBuilder("Satyabhama");
		StringBuilder sb2 = new StringBuilder("krishna");
		sb1.append(sb2);
		System.out.println(sb1);
		
		StringBuffer s3 = new StringBuffer("ram");
		StringBuffer s4 = new StringBuffer("sita");
		s3.append(s4);
		System.out.println(s3);

	}

}
