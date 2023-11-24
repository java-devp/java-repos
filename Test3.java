package com.test.intv;

public class Test3 {

	public String getName(String s1) {
		try {
			System.out.println("in Main try Block ");
			get(s1);
			try {
				String s2 = null;
				int a = 0;
				// a = a/0;
				System.out.println("in GetName()" + s1.toString());
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("In catch of getName() " + s1 + " :: ABC");
				s1 = s1+ " Inner catch Block :: OM";
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("In main catch of getName() " + s1 + " :: BBA");
		}
		return s1;
	}

	public String get(String s1) {
		System.out.println("BB BB BB BB");
		getLastName(s1);
		return s1;
	}

	public String getLastName(String s1) {

		try {
			int a = 0;
			a = a / 0;
			System.out.println("IN getLastName");
		} catch (Exception e) {
			System.out.println("In Catch getLastName ee");
			throw new RuntimeException("Getting new Exceptione " + e.getMessage().toString() + e);
		}
		/*
		 * finally { System.out.println("In finally "); }
		 */
		return s1 + "Hero";
	}

	public static void main(String[] args) {
		Test3 t3 = new Test3();
		String name = t3.getName("Hello");
		
		System.out.println(name);
	}

}
