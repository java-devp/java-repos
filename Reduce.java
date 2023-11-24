package com.test.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Reduce {
	
	public static void main(String[] args) {
		
		
		 int product = IntStream.range(1, 2)
                 .reduce((num1, num2) -> num1 * num2)
                 .orElse(-1);
		 
		 System.out.println(product);
		 
		 
		 List<Integer> list = Arrays.asList(10,20,30,40,50,60,70,80);
		 
		 Optional<Integer> a = list.stream().reduce((a1,b2) -> a1+b2);
		 Integer reduce = list.stream().reduce(1,Integer::min);
		 
		 System.out.println(a);
		 System.out.println(reduce);
		 
		 

	}

}
