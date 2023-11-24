package com.test.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Technical {

	public static void main(String[] args) {

		int arr[] = { 19, 22, 34, 54, 65, 99, 46, 47, 86 };

		Stream<Integer> boxed = Arrays.stream(arr).boxed();
		
		Integer integer = Arrays.stream(arr).
				                  boxed().
				                  sorted(Comparator.reverseOrder()).
				                  skip(2).
				                  findFirst().
				                  get();
		
		System.out.println(integer);
		
		
		int a,b =0 ;
		for(int i = 0; i<arr.length; i++) {
			
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					b = arr[i];
					arr[i] =arr[j];
					arr[j] = b;
				}
			}
			
		}
		
		System.out.println(b);
	//	System.out.println(a);
		
		 int temp, size;
	      int array[] = {10, 20, 25, 100, 63, 96, 57};
	      size = array.length;

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){

	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	      System.out.println("Third second largest number is:: "+array[size-2]);
	   
	      
	      
	      
	      int ar[] = {1,2,3,5,7,4,7};
	      
	      int target = 8;
	      Arrays.sort(ar);
	       
	      int length = ar.length-1;
	      int midLength = length/2;
	     
	      

	      if(target<ar[midLength]) {
	    	  for (int i =0; i<length-midLength; i++) {
	    		  
	    	  }
	      }
	      
	       	
	      

	}

}
