package com.test.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Joining {
	
	public static void main(String[] args) {
		
		
		List<Game> list = Arrays.asList(
                new Game("Dragon Blaze", 5),
                new Game("Angry Bird", 5),
                new Game("Candy Crush", 5),
                new Game("Dragon Blaze", 5)
        );

		String collect = list.stream().map(x-> x.getName()).collect(Collectors.joining(",", "{","}"));

		System.out.println(collect);
		
		 list.stream().map(x -> x.getName()).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting())).
		 entrySet().stream().filter(x -> x.getValue() !=1).forEach(x -> {
			 System.out.println(x.getKey());
		 });
		
		
		
	}
}
	class Game{
		
        String name;
        int ranking;

        public Game(String name, int ranking) {
            this.name = name;
            this.ranking = ranking;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRanking() {
            return ranking;
        }

        public void setRanking(int ranking) {
            this.ranking = ranking;
        }
    
}
