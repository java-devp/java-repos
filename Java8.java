package com.test.intv;

import java.io.File;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.test.java8.Level;

public class Java8 implements Cloneable {

	public static void main(String[] args) {
		Map<Integer, Product> has = new HashMap<>();
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		productsList.add(new Product(5, "Acer Laptop", 90000f));
		
		for(Product p : productsList) {
			
			if(p.getPrice()>25000f) {
				Integer id =  p.getId();
				if(!has.containsKey(p)) {
				has.put(id, p);
				}
			}
		}
		Map<Integer, Product> has1 = new HashMap<>();
		productsList.stream().filter(x -> x.getPrice() > 20000f).forEach( x ->{
			if(!has.containsValue(has1))
			has1.put(x.id, x);	
		});

				
		for(Map.Entry<?, ?>  e :has.entrySet()) {
			Object key = e.getKey();
		    Object value = e.getValue();	
		}
		
		
		Set<Integer> keySet = has.keySet();
		Collection<Product> values = has.values();
		
		Iterator<Entry<Integer, Product>> iterator2 = has.entrySet().iterator();
		
		while(iterator2.hasNext()) {
			Entry<Integer, Product> next = iterator2.next();
			next.getKey();
		}
		/*
		 * Map<?, Integer> collect11 = productsList.stream()
		 * .collect(Collectors.toMap(Product::getName, Product::getId));
		 * 
		 */
	//	System.out.println("Collect11"+collect11);
		
		System.out.println("HAS Map"+has);
		// match - boolean
		boolean allMatch = productsList.stream().allMatch(p -> p.name.equals("HP Laptop"));

		System.out.println(allMatch);

		// match - boolean
		boolean anyMatch = productsList.stream().anyMatch(p -> p.name.equals("HP Laptop"));

		System.out.println(anyMatch);

		// filter
		List<Float> collect = productsList.stream().filter(p -> p.price > 25000f).map(p -> p.price)
				.collect(Collectors.toList());

		System.out.println(collect);

		// sum
		double sum = productsList.stream().mapToDouble(p -> p.price).sum();

		System.out.println(sum);

		// reverse order
		List<Float> collect2 = productsList.stream().map(p -> p.price).sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());

		System.out.println(collect2);

		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32, 32);
		// getting even no
		System.out.println("getting even no");
		list.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
		// getting no which have 1
		System.out.println("getting no which have 1");
		list.stream().map((x) -> x + "").filter(x -> x.startsWith("1")).forEach(System.out::println);
		// getting first no if present
		System.out.println("//getting first no if present ");
		list.stream().findFirst().ifPresent(System.out::println);
		// maximum value element present i
		System.out.println("////maximum value element present in ");
		Integer max = list.stream().max(Integer::compare).get();
		System.out.println(max);

		String s = "Java articles are Awesome";

		Product p = new Product(1, "HP Laptop", 25000f);

		List<String> items = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya",
				"pineapple");

		List<String> collect10 = items.stream().filter(x -> x.startsWith("p")).sorted()
				.map(x -> x.substring(0, 1).toUpperCase() + x.substring(1)).collect(Collectors.toList());

		System.out.println("Collect::" + collect10);

		Map<String, Long> collectIteams = items.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collectIteams);

		Map<String, Long> result = collectIteams.entrySet().stream()
				.sorted(Map.Entry.<String, Long>comparingByKey().reversed())
				.collect(Collectors.toMap(Map.Entry::getKey,
						Map.Entry::getValue, (key, value) -> key, LinkedHashMap::new));

		System.out.println("RESULT " +result);

		List<Item> items1 = Arrays.asList(new Item("apple", 10, new BigDecimal("9.99")),
				new Item("banana", 20, new BigDecimal("19.99")), new Item("orang", 10, new BigDecimal("29.99")),
				new Item("watermelon", 10, new BigDecimal("29.99")), new Item("papaya", 20, new BigDecimal("9.99")),
				new Item("apple", 10, new BigDecimal("9.99")), new Item("banana", 10, new BigDecimal("19.99")),
				new Item("apple", 20, new BigDecimal("9.99")));

		String s1 = "Apple, Apple, Mango, Watermelon, Mango";
		String dtr[] = s1.split(", ");
		 Stream.of(dtr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		               .entrySet().stream().filter(x -> x.getValue() > 1).forEach( x -> {
		            	   System.out.println("double " + x.getKey());
		            	   System.out.println(x);
		            //	   Map<String,Integer> aa = x;
		               });
		 Set<String> ss1 = new HashSet<>();
		 Stream.of(dtr).filter( x->!ss1.add(x)).forEach(x ->{
			 System.out.println("CSCSDCSCCSC     ");

		 });
		 
		Map<String, Double> collect3 = items1.stream()
				.collect(Collectors.groupingBy(Item::getName, (Collectors.summingDouble(Item::getQty))));

		// items1.stream().sorted(Comparator.thenComparingDouble(Item::getPrice).reversed()).limit(5).collect(Collectors.toList());

		System.out.println("Collect3"+collect3);

		Map<BigDecimal, List<Item>> collect5 = items1.stream().collect(Collectors.groupingBy(Item::getPrice));

		Map<BigDecimal, Set<String>> collect4 = items1.stream()
				.collect(Collectors.groupingBy(Item::getPrice, Collectors.mapping(Item::getName, Collectors.toSet())));

		System.out.println(collect4);
		System.out.println(collect5);

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println();
		System.out.println(collect3);

		Map<String, Integer> collect6 = items1.stream()
				.collect(Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));
		System.out.println(collect6);

		for (Map.Entry<String, Integer> map : collect6.entrySet()) {
			System.out.println(map.getKey() + "::" + map.getValue());
		}

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println();

		Iterator<Entry<String, Integer>> iterator = collect6.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<String, Integer> next = iterator.next();
			System.out.println(next.getKey() + "::" + next.getValue());
		}

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println();

		collect6.forEach((k, v) -> {
			System.out.println(k + "::" + v);
		});

		Map<String, Long> collect7 = items.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(collect7);

		Map<String, Integer> map = new HashMap<>();
		String ss = "abc abc aan aac";

		String sr[] = ss.split(" ");

		System.out.println(Arrays.toString(sr));
		for (String r : sr) {

			if (map.containsKey(r)) {
				map.put(r, map.get(r) + 1);
			} else
				map.put(r, 1);

		}

		System.out.println(map);

		Map<String, Long> collectIteams1 = items.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collectIteams1);

		List<Float> collect8 = productsList.stream().sorted(Comparator.comparingDouble(Product::getPrice).reversed())
				.limit(5).map(x -> x.getPrice()).distinct().collect(Collectors.toList());

		System.out.println(collect8);

		Runnable r1 = () -> {
			System.out.println("ABC");
		};

		List<Float> collect9 = productsList.stream().sorted(Comparator.comparingDouble(Product::getPrice).reversed())
				.limit(5).map(x -> x.getPrice()).distinct().collect(Collectors.toList());

		System.out.println("Collect9" + collect9);

		productsList.stream().map(x -> x.getPrice()).sorted(Comparator.reverseOrder()).limit(5).distinct().skip(0)
				.forEach(System.out::println);

		int input[] = { 6, 1, 5, -1, 7, 0 };
		int count = 0;
		Map<Integer, Integer> hs = new HashMap<>();

		for (int i = 0; i < input.length - 1; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] + input[j] == 6) {
					count++;
					System.out.print("{" + input[i] + "," + input[j] + "}");
				}
			}
		}
		System.out.println(count);
		System.out.println(hs);

		String sb = "mango";
	

		String c = sb.substring(1);

		System.out.println(c);
		
		int a = 0;
		int b = input.length;
		for(int i =0; i<input.length; i++) {    // 8,6,2,8,4,5
		int count1  =0;
			for(int j =i+1; j<input.length; j++) {
				System.out.println("Internal::" + count1++);
				if(input [i] < input[j]) {
					a = input[i];  
					input[i] = input[j];  
					input[j] = a; 
				}
			}
		}
		 System.out.println( Arrays.toString(input));
		
         System.out.println("MAX: "+ input[input.length -1] + "::" + "MIN: " + input[input.length -b + 1]);
         
         
         Level l1[] = Level.values();
         Level l2 = Level.valueOf("First");
         System.out.println(l2.Second);
          
          for(Level l : Level.values()) {
        	  System.out.println( l + ": " + l.getPrice(0)   );
          }
          
          Set<String> hs1 = new HashSet<>();
          hs1.add("LL");
          
          m1(10);
          Queue<String> queue=new PriorityQueue<String>();  
          
          
          String str1 = "AACD";  //AACDAACD   // ABCDCDBA
          String str2 = "ACDA";
   
          // Fuinction call
          if (areRotations(str1, str2))
              System.out.println(
                  "Strings are rotations of each other");
          else
              System.out.printf(
                  "Strings are not rotations of each other");
      
          System.out.println((str1 + str1));
         
          if(str1.length() == str2.length()) {
        	  (str1 + str1).indexOf(str2);
        	  int indexOf = (str1).indexOf(str2);
        	  System.out.println("Index Of " +indexOf);
          }
          
          
          Map<String, Integer> jj = new Hashtable<>();
          
           jj.put(null, 1);
           System.out.println(jj);
          Map<String, Integer> kk = new TreeMap<>();
          kk.put("",1);
          
          
          
	}
	
	
	static boolean areRotations(String str1, String str2)
    {
        // There lengths must be same and str2 must be
        // a substring of str1 concatenated with str1.
        return (str1.length() == str2.length())
            && ((str1 + str1).indexOf(str2) != -1);
    }
	
	void m1() throws Exception {
		FileInputStream file = new FileInputStream(new File(""));
		try {
		} catch (ArithmeticException e) {
		}
	}
	
	static void m1(int i) {
		if( i> 0) {
			System.out.println("IIII " +i);
			m1(i-1);
		}
	}

}
