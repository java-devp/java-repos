package com.test.intv;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapClass {

	public static void main(String[] args) {
		
		Map<User, Integer> map = new HashMap<>();
		
		
		
		User d1 =  new User("A",1);
		User d2 =  new User("C",2);
		User d3 =  new User("D",3);
		User d4 =  new User("B",4);
		User d6 =  new User("R",6);
		User d5 =  new User("X",5);
		User d7 =  new User("P",7);
		User d8 =  new User("Z",7);
		
		
		List<User> list = Arrays.asList(d1,d4,d7,d2,d6,d3,d5,d8);
		
		map.put(d1, 1);
		map.put(d2, 2);
		map.put(d3, 3);
		map.put(d4, 4);
		map.put(d5, 5);
		map.put(d6, 6);
		map.put(d7, 7);
		map.put(d8, 8);
		
		System.out.println(map);
		
		int a = map.get(d1).hashCode();
		int b = map.get(d2).hashCode(); 
		int c = map.get(d3).hashCode(); 
		int d = map.get(d4).hashCode(); 
		int e = map.get(d5).hashCode(); 
		int f = map.get(d6).hashCode(); 
		int g = map.get(d7).hashCode(); 
		
		
		Collections.sort(list);
	
		
		Integer orDefault = map.getOrDefault(d7, 100);
		System.out.println(orDefault);
		
		System.out.println(a + "::" + b+"::" + c + "::"+d + "::"+ e+"::" + f + "::"+ g );
		
		System.out.println(map);
		
		map.forEach((k,v) -> {
			System.out.println(k.getName());
		});
		
		list.forEach(x ->{
			System.out.println(x.getAge()); 
		});
		
		
		Set<User> set = new HashSet<>();
		set.add(d2);
		set.add(d5);
		set.add(d7);
		set.add(d3);
		set.add(d1);
		set.add(d8);
		set.add(d6);
		set.add(d4);

		
		 set.stream().sorted(Comparator.comparing(User::getAge)).forEach(x -> {
			 System.out.println(x);
		 });
		 
		 map.entrySet().stream().map(x -> x.getKey())
		  .sorted(Comparator.comparing(User::getName)).forEach(x -> {
			  System.out.println(x);
		  });
				 
				 
	 
	 Queue<Integer> q = new PriorityQueue<Integer>();
		 
		 q.add(1);
		 q.add(4);
		 q.add(123);
		 q.add(44);
		 q.add(54);
		 q.add(43);
		 q.add(556);
		 q.add(90);
		 
    System.out.println(q);

    
    
    String s = "12345";   // 1 
    String str[] =  s.split("");
    int count = 0;
    Integer l = 1;
    
    for(int i =0; i<s.length(); i++) {
    	
    	Integer k = Integer.valueOf(str[i]);
    	System.out.println(k);
    	
    	l = l*k;
    	
    }
    
    System.out.println(l);
    
    
    String one  = "12";
    
    Integer ie = Integer.valueOf(one.charAt(0));
    
    System.out.println(ie);
    
		
    
    int ar[]  = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    int low = ar[0];
    int high = ar[ar.length-1];
    int mid =  ar.length/2;
    int key = 13;
    
    if(key==mid) {
    	System.out.println(mid);
    }
    
    if(key > mid) {
    	for(int i=0; i<mid; i++) {
    		if(key==ar[i]);
    	}
    }
    
    if(key < mid) {
    	
    }
    
    
    
		
	}

}
