package com.javaex.practice;

public class Ex04 {

	public static void main(String[] args) {
		//문제 4

		int[] data = {1,3,5,8,9,11,15,19,18,20,30,33,31};
		int count = 0;   //갯수 셀 변수 선언
		int sum = 0;     //3의 배수 합할 변수 선언
		
				
		for (int i = 0; i < data.length; i++) {
			if (data[i] % 3 == 0) {
				count++;        // count 초기값 0이므로 한번 반복되서 나갈때마다 ++1됨.
				sum =sum + data[i]; // sum의 초기값은 0이지만 반복되서 나갈때마다 누적되므로 3+9+...이런식으로 누적되어서 합 계산됨
				
			}
			
			
		}
		
		System.out.println("주어진 배열에서 3의 배수의 개수 => " + count);
		System.out.println("주어진 배열에서 3의 배수의 합 => " + sum);
	}

}
