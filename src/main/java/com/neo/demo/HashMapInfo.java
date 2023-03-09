package com.neo.demo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collector;


public class HashMapInfo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "Raju");
		map.put(1, "Bhaskara");
		map.put(2, "Prasad");
		map.put(5, "Pavan");
		map.put(4, "Ravi");
		map.put(3, "Surya");
		
		
		System.out.println(map);
		
		//System.out.println(map.get(10));
		
		//Set<Integer> mapKeys = map.keySet();

		//System.out.println(map.keySet());
		
		Set<Entry<Integer, String>> mapEntrySet = map.entrySet();
		System.out.println(map.entrySet());
		
		
		System.out.println(map.values());
		
		HashMap<Integer, String> map1 = new HashMap<>(map);
		
		
		System.out.println(map1);
		
		
		
		HashMap<Integer, String>  m = new HashMap<>();
		m.put(1, "Praveen");
		m.put(2, "Prashanth");             //ConcurrentModificationException
		
		Map<Integer, String> syncMap = Collections.synchronizedMap(m);
		
		syncMap.put(3, "Kumar");
		syncMap.put(2, "Raju");
		
		
		ConcurrentHashMap<Integer, String> cm = new ConcurrentHashMap<>();
		
		cm.put(1, "kumar");
		cm.put(2, "Bhaskara");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
