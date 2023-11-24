package com.test.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.test.intv.Developer;

public class FlatMap {
	
	public static void main(String[] args) {
		
		
		String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

		 Stream<String[]> stream1 =  Arrays.stream(array);
		 
		List<String[]> collect = stream1.filter(x -> {
			for(String s : x) {
				if(s.equals("a"))
					return false;
			}
			return true;
			
		}).collect(Collectors.toList());
		
		collect.stream().forEach(x -> System.out.println(Arrays.toString(x)));
		
		
		String[] array2 = Stream.of(array).flatMap(Stream::of).toArray(String[]::new);
	
		List<String> collect2 = Stream.of(array).flatMap(Stream::of).collect(Collectors.toList());
		ArrayList<String> aa = new ArrayList<>();
		ArrayList<String> bb = new ArrayList<>();
	
		
		Stream.of(array).flatMap(Stream::of).forEach(x ->{
			if(x.equals("a")) {
				System.out.println(x);
		}
			else {
				System.out.print(x);
			}
			
		});
		
		System.out.println();
		System.out.println(Arrays.toString(array2));
        collect2.forEach(System.out::println);
		  
		  
        
        
        Developer o1 = new Developer();
        o1.setName("mkyong");
        o1.addBook("Java 8 in Action");
        o1.addBook("Spring Boot in Action");
        o1.addBook("Effective Java (3nd Edition)");

        Developer o2 = new Developer();
        o2.setName("zilap");
        o2.addBook("Learning Python, 5th Edition");
        o2.addBook("Effective Java (3nd Edition)");

        List<Developer> list = new ArrayList<>();
        list.add(o1);
        list.add(o2);
        
        
        list.stream().map(x -> x.getBook()).forEach(x -> {
        	System.out.println(x);
        });
        
		Set<String> collect3 = list.stream().map(x -> x.getBook())
				.flatMap(x -> x.stream())  
				.filter(x -> !x.toLowerCase()
				.contains("python")).collect(Collectors.toSet());
		
		System.out.println(collect3);
		
		Set<String> collect4 = list.stream()
				.flatMap(x -> x.getBook().stream())  
				.filter(x -> !x.toLowerCase()
				.contains("python")).collect(Collectors.toSet());
		
		System.out.println(collect4);
        
		
		int[] arr= {1, 2, 3, 4, 5, 6};
		
		for(int i =0; i<= arr.length-1; i++) {
			System.out.println(arr[i]);
		}
	}
	
	


}
