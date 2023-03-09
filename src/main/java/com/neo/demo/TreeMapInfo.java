package com.neo.demo;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapInfo {

	public static void main(String[] args) {
		
		
		TreeMap<Integer, String> tmap = new TreeMap<>( new MyComparator()  );
		tmap.put(5, "ZZZ");
		tmap.put(1, "yyy");
		tmap.put(2, "xxx");
		tmap.put(3, "www");
		tmap.put(4, "uuuu");
		
		System.out.println(tmap);
		
		
		//TreeMap tmap1 = new TreeMap<>();
		
		//tmap1.put(null, null);
		//tmap1.put(101, null);
		//tmap1.put(102, null);
		
		//System.out.println(tmap1);

	}

}




class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		
		return i2.compareTo(i1);
	}
	
}

























