package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		//문제2
		
		double[] num = new double[3];
		num[0] = 1.2;
		num[1] = 3.3;
		num[2] = 6.7;
		
		for(int i = 2; i < num.length &&i>=0 ; i--) {  // 방크기가 3칸짜리이므로 i의 초기값을 2로 주고 조건식에 
													   // i의 값은 num의 방 크기보다 작고 0과 같거나 커야 한다.
													  // i>=0을 주지 않으면 증감식은 --이므로 -값까지 내려가게 된다.
			                                    //그렇게되면 출력은 되지만 오류뜬다.
			System.out.println(num[i]);
		}
		

	}

}
