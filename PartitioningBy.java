package com.test.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningBy {
	
	
	public static void main(String[] args) {
		
		 List<Integer> list = Arrays.asList(10,20,30,40,50,60,70,80);
		
		Map<Boolean, Long> collect = list.stream().
				collect(Collectors.partitioningBy(x -> (x >20),
						Collectors.counting()));
		 
		System.out.println(collect);
	}

}
