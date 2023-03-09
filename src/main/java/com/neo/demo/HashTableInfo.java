package com.neo.demo;

import java.util.HashMap;

public class HashTableInfo {
	
	public static void main(String[] args) {
		
		
		/*
		 * Hashtable<Integer, String> h = new Hashtable<>();
		 * 
		 * h.put(100, "A"); h.put(101, "W"); h.put(102, "E"); h.put(103, "O");
		 * h.put(104, "Y");
		 * 
		 * //System.out.println(h);
		 * 
		 */
		
		//HashMap<Integer, String> map = new HashMap<>();
		
		/*
		 * map.put(100, "Y"); map.put(200, "R"); map.put(300, "t"); map.put(400, "k");
		 */
		
		
		
		
		
		
		String s1 = "FB";
		String s2 = "Ea";

		System.out.println(s1.hashCode()+"   "+s2.hashCode());
		
		String s3 = "Raju";
		String s4 = "Kumar";
		
		System.out.println(s3.hashCode()+"   "+s4.hashCode());
		
		
		HashMap<String , Integer> map2 = new HashMap<>();
		map2.hashCode();
		
		map2.put(s3, 100);
		map2.put(s4, 200);
		map2.put(s1, 101);
		map2.put(s2, 102);
		map2.put("etr", 102);
		map2.put("sd", 102);
		
		System.out.println(map2);
		
		
		
		
	}

}
