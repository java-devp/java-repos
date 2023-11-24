package com.test.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.test.intv.User;


public class Sorted {
	
	
	static Sorted  s= new Sorted();
	public void Sorted1(Object o) {
		System.out.println("JLNSK");
	}
	
	public static void main(String[] args) {
		 Sorted  s= new Sorted();
		 
		 
		 StringBuilder c = new StringBuilder("hacker");
		 c.append(4).deleteCharAt(3).delete(3, c.length()-1 );
		 
		 System.out.println("SDS::::::"+c);
		 
	        s.Sorted1(555);
		List<String> list = Arrays.asList("9", "A", "Z", "1", "B", "Y", "4", "a", "c");
		
		List<String> collect = list.stream().sorted().collect(Collectors.toList());
		System.out.println(collect);
		
		List<String> collect2 = list.stream().
				sorted(Comparator.naturalOrder()).
				collect(Collectors.toList());
		System.out.println(collect2);
		
		List<String> collect3 = list.stream().
				sorted(Comparator.reverseOrder()).
				collect(Collectors.toList());
		System.out.println(collect3);
		
		List<String> collect4 = list.stream().
				sorted((x,y)-> y.compareTo(x)).
				collect(Collectors.toList());
		System.out.println(collect4);
		
		
		List<User> users = Arrays.asList(
	            new User("C", 30),
	            new User("D", 40),
	            new User("A", 20),
	            new User("B", 10),
	            new User("E", 50));
		
		List<Integer> collect5 = users.stream().
				 map(x-> x.getAge()).
		         sorted(Comparator.reverseOrder()).
		         collect(Collectors.toList());
		
		System.out.println(collect5);
		
		List<User> collect6 = users.stream()
				.sorted(Comparator.comparingInt(User::getAge).thenComparing(User::getName))
				.collect(Collectors.toList());
		
		System.out.println(collect6);
		
		List<User> collect7 = users.stream()
				.sorted(Comparator.comparingInt(User::getAge).reversed())
				.collect(Collectors.toList());

		System.out.println(collect7);
		
		List<User> collect8 = users.stream()
				.sorted(Comparator.comparing(User::getAge))
				.collect(Collectors.toList());
		
		
		System.out.println("Collect 8"+collect8);
		
		int[] values = new int[3];
		values[0] = 10;
		values[1] = new Integer(5);
		values[0] = 15;

		for(int i =1; i<values.length; i++) {
			System.out.println(values[i] -values[i-1]);
		}
	}

}
