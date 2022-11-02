package com.lv1;

import java.util.Arrays;


// 미제
public class RmSmallestNum {
	/*
	 * 문제 설명
	 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
	 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
	  예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
	 */
	
	/*
	 제한 조건
		arr은 길이 1 이상인 배열입니다.
		인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
	 */

	public static void main(String[] args) {
		int[] answer = {};
		int[] zero = {-1};
		//입출력 예 
		int[] arr = {10, 9, 3, 4, 6, 4, 7, 512, 252, 343};
		// 기대값
		// [4,3,2]
		
		//배열을 정렬하는 함수 sort를 이용하여 내림차순 정렬한다.
		Arrays.sort(arr);
		for (int i = 0; i < arr.length/2; i++) {
			int tmp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = tmp;
			
		}
		// 출력확인
		for (int i = 0; i < arr.length; i++) {
			System.out.print( arr[i] );
			
		}
		System.out.println(  );
		// 마지막 값을 날리거나, 값이 하나일경우에는 -1을 리턴한다.
		if(arr.length == 1) {
			System.out.print( "배열 1개일때, 조건문 진입" );
			answer = zero.clone();
			}
		else answer = Arrays.copyOfRange(arr, 0, arr.length-1);
		
		// 출력확인
		for (int i = 0; i < answer.length; i++) {
			System.out.print( answer[i] );
		}
	}

}
