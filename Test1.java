package com.test.intv;

public class Test1 {

	
	public static String reverse(String in) {
		if (in == null)
			throw new IllegalArgumentException("Null is not valid input");

		StringBuilder out = new StringBuilder();

		char[] chars = in.toCharArray();

		for (int i = chars.length - 1; i >= 0; i--)
			out.append(chars[i]);

		return out.toString();
	}
	
	public static void main(String[] args) {
		String str = "123";

		System.out.println(reverse(str));
		
		
		
		String s1 = "Happy Birthday to you   XYZ";
		String s2[] = s1.split(" ");
		
		int length = s2.length-1;
		
		System.out.println(s2.length);
		int count = 0;
		String s3 = "";
		for(int i= length; i>=0; i--) {
			if(s2[i].contains(" ")) {
				count ++;
			}
			s3 += s2[i] + " ";
		}
	    System.out.println(count);
		System.out.println(s3);
		
		
		for(int i = s1.length()-1; i>=0; i--) {
			System.out.print(s1.charAt(i));
		}
		
		
		System.out.println();
		
		String  s= null;
		
		if(s.contains("AA")) {
			System.out.println("ASA");
			
		}
		
		
	}
}


