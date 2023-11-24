package com.test.intv;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Default {
	
	public static void main(String[] args) {
		
		DefaultInterface  qb = () -> {
			System.out.println("ABC");
		};
		
		
		String input = "ioduznfhfdjdf";
		
		
		String str[] = input.split("");
		
		Map<String, Long> collect = Stream.of(str)
				                    .collect(Collectors.groupingBy(Function.identity(), 
				                    		Collectors.counting()));
		System.out.println(collect);
		
		
		Map<String, Long> collect2 = Stream.of(str)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(x -> x.getValue() > 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(collect2);
		
		
		String key = Stream.of(str).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting())).
		entrySet().stream().filter(x -> x.getValue() !=1).findFirst().get().getKey();
		
		  Integer.parseInt(key);
		 String key2 = Stream.of(str).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting())).
		 entrySet().stream().filter(x -> x.getValue() !=1).skip(1).findFirst().get().getKey();
		 
		 System.out.println("Key::" +key2);
		
		System.out.println(key);
		
		int number[] = {1,4,7,9,3,2};
		
		Integer integer = Arrays.stream(number).boxed()
				                .sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
		System.out.println(integer);
		
		String s1[] = {"Great", "Superb","good","nice","Excellent","Awesome"};
		
		String string = Stream.of(s1).reduce((w1,w2) -> w1.length()>w2.length() ? w1 : w2).get();
		System.out.println(string);
		
		
		
		int ar[] = {6,1,5,-1,7,0};
		
		int[] ir = { 12, 44, 6, 13, 32, 15, 3, 89 };
		
		
		List<String> collect3 = Arrays.stream(ir).boxed().map(x -> x +"").filter(x -> x.startsWith("1"))
				                                 .collect(Collectors.toList());
		
		System.out.println(collect3);
		
		
		
		// first array
 		int a[] = { 25, 40, 50 };
		// second array
		int b[] = { 35, 42,45, 55, 60, 65 };

		int c[] = new int[a.length + b.length];
			int countA = 0;
		for (int i = 0; i < b.length; i++) {
			
			if (i < a.length) {
				if(a[i]< b[i]) {
				c[countA] = a[i];  
				countA++;
				}
			}
				if (i < b.length ) {
					//if(b[i]< a[i])
					c[countA] = b[i]; // i =1 : 45
					countA++;
			}
		}
		
	
		
		System.out.println(Arrays.toString(c)); 
		
	/*	for (int i = 0, j = 0; i < c.length; i++) {
			
			if(i <a.length) {
				c[i] = a[i];
			}
			else {
				c[i] = b[j];
				j++;
			}
		}*/
		System.out.println(Arrays.toString(c));
		
		 Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		int[] values = new int[3];
		values[0] = 10;
		values[1] = new Integer(5);
		values[0] = 15;

		for(int i =1; i<values.length; i++) {
			System.out.println(values[i] -values[i-1]);
			
			
		}
		
	
		
		
		
	}
	
	

}
