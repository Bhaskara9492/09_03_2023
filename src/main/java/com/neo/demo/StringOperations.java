package com.neo.demo;

public class StringOperations {

	public static void main(String[] args) {
		
		String s1 = "Raju";
		String s2 = "Raju";
		
		System.out.println(s1 == s2);
		
		/*
		 * String s3 = "Raju"; String s4 = "Raju";
		 * 
		 * System.out.println(s3.equals(s4));
		 */
		
		String s5 = new String("Raju");
		String s6 = new String("Raju");
		
		System.out.println(s5 == s6);
		System.out.println(s6 == s1);
		System.out.println(s6 == s2);

	}

}
