package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		//문제 3
		
		
		int[] intA = {3, 6, 9};  // intA의 방 크기는 3개이며 방의 값은 3,6,9
		
		int[] intB;              //intB 선언
		intB = intA;              // intA의 값을 intB에 대입.
		intB[0] = 20;             // intB의 0번째 방의 값은 20
		intB[2] = 10;			  // intB의 2번째 방의 값은 10
		
		for(int i = 0; i < intA.length; i++) {  // i의 값은 0으로 시작해 intA의 방의 크기보다 적게 반복
			System.out.println(intA[i]);        // intA의 값을 출력시키는건데 intB = intA. 선언은 intA의 값을 3,6,9줬으니
		}          								// 3,6,9 출력될듯.(x)
												// -틀림- intB = intA이므로
	}											// 3-->20, 9-->10으로 대입.
												// 20, 6, 10출력 (좀더 생각하면 알수있었는데 까비)
}
