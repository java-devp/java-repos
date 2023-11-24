package com.test.intv;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MainClass {
	
	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<>();
		Map<String, Integer> syncMap = Collections.synchronizedMap(hashMap);
		Map<String, Integer> conMap = new ConcurrentHashMap<>();
		MapHelper1 mapHelper1 = new MapHelper1(hashMap);
		MapHelper2 mapHelper2 = new MapHelper2(hashMap);
		MapHelper3 mapHelper3 = new MapHelper3(hashMap);
		MapHelper4 mapHelper4 = new MapHelper4(hashMap);

		for (Map.Entry<String, Integer> e : syncMap.entrySet()) {
			System.out.println(e.getKey() + "=" + e.getValue());
		}

	}

}



