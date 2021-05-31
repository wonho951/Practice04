package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		
		// 문제 8
		
		int[] num = new int[6];    // 방 6개 줌.
		
		for (int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*45+1);       //num은 1~45까지의 랜덤값을 가짐.
			
			for (int j = 0; j<i; j++) {				
				if (num[i] == num[j]) {					// 위의 i값과 j값을 비교했을때
					i--;								// 같은 값이 나온다면 i값에서 1을 빼면(최대값 46인데 ++되면 46을 넘어감)  
														// 다른값이 나올때 까지 계속 반복을 돌림.
				}
			}
		}
		for(int i = 0; i < num.length; i++)
			System.out.print(num[i] + " ");
		
				
		
		
	}

}
