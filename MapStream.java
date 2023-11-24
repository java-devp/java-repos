package com.test.java8;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.test.intv.Staff;
import com.test.intv.StaffPublic;

public class MapStream {
	
	
	public static void main(String[] args) {
		
		
		
		List<String> alpha = Arrays.asList("a", "b", "c", "d");
		
		
		List<String> collect = alpha.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
		
	    System.out.println(collect);
	    
	    List<Staff> staff = Arrays.asList(
                new Staff("mkyong", 30, new BigDecimal(10000)),
                new Staff("jack", 27, new BigDecimal(20000)),
                new Staff("lawrence", 33, new BigDecimal(30000))
        );

	    
	    List<String> collect2 = staff.stream().map(x -> "Name : " +x.getName()).collect(Collectors.toList());
	    
	    System.out.println(collect2);
	    
	    
		List<StaffPublic> staffPublic = staff.stream().map(x ->
		         new StaffPublic(x.getName(), x.getAge(), null))
				.collect(Collectors.toList());
		
		System.out.println(staffPublic);
	}

}
