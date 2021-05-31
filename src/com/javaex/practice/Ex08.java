package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		
		// 문제 8
		
		int[] num = new int[6];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*45+1);
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
	}

}
