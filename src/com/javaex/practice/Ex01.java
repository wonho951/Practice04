package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		
		
		//문제 1
		/*
		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		for (int i = 0; i <= intArray.length; i++) {  // 부등호에 =이 들어갔기때문.
			result = result + intArray[i];
		}
		System.out.println(result);
		*/
		
		//코드 수정
		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		for (int i = 0; i < intArray.length; i++) {  
			result = result + intArray[i];
		}
		System.out.println(result);
		// 방의 갯수는 5개지만 0,1,2번 방에만 값을 주고 3,4는 기본값(0)이다. 
		// 반복의 횟수는 i의 값이 0으로 시작해서 intArray의 방의 갯수보다 적게 돌리지만
		// 3,4번방에 값이 기본값(0)이기에 0,1,2의 값만큼만 돌려서 3+7+12 = 22가 나온다.
	}

}
