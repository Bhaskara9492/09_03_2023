package com.neo.demo;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapInfo {
	
	public static void main(String[] args) {
		
		Integer i1 = new Integer(20);
		Integer i2 = new Integer(20);

		
		System.out.println(i1.equals(i2));
		
		System.out.println(i1 == i1);
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(i1, "Bhaskara");
		map.put(i2, "Prasad");
		
		System.out.println(map);
		
		
		
		IdentityHashMap<Integer, String> imap = new IdentityHashMap<>();
		imap.put(i1, "Raju");
		imap.put(i2, "Kumar");
		
		System.out.println(imap);
		
		
	}

}
