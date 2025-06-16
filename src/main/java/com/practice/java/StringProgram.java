package com.practice.java;

import org.testng.annotations.Test;

public class StringProgram {

	@Test
	public void reverseString() {
		String s="Geeta";
		System.out.print(s);
		System.out.println();

		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
}
