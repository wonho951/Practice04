package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// 문제5
		
		Scanner sc = new Scanner(System.in);
		
		double num;
		double[] num01 =  new double[5];		
		double sum = 0;
		
		for (int i = 0; i<num01.length; i++) {
			num = sc.nextDouble();
			sum = sum + num;
		}
		
				
		System.out.println("평균은 " + sum / num01.length +  " 입니다.");
		sc.close();

	}

}
