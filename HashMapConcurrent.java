package com.test.intv;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapConcurrent extends Thread {

	Map<String, Integer> map = new HashMap<>();
	
	public HashMapConcurrent() {
		Map<String, Integer> synchronizedMap = Collections.synchronizedMap(this.map);
		map = synchronizedMap;
		
	}

	{
		new Thread() {
			@Override
			public void run() {
				System.out.println("in first thread");
				map.put("one", 1);
				try {
					Thread.sleep(100);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}.start();
	}

	{
		new Thread() {
			@Override
			public void run() {
				System.out.println("in second thread");
				map.put("two", 2);
				try {
					Thread.sleep(100);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				

			}
		}.start();
	};

	{
		new Thread() {
			@Override
			public void run() {
				System.out.println("in third thread");
				map.put("three", 3);
				try {
					Thread.sleep(100);
					

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}.start();
	}

	public static void main(String[] args) {
		HashMapConcurrent h1 = new HashMapConcurrent();
		

	//	h1.map = new HashMap<>();
		
		System.out.println(h1.map);
		
		Integer i = 1;
		Integer i1 =new Integer(1);
		
		System.out.println(i==i1);

	}

}
