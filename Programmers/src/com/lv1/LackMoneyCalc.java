package com.lv1;

public class LackMoneyCalc {
	/*
	 문제 설명
		새로 생긴 놀이기구는 인기가 매우 많아 줄이 끊이질 않습니다.
		 이 놀이기구의 원래 이용료는 price원 인데, 놀이기구를 N 번 째 이용한다면 원래 이용료의 N배를 받기로 하였습니다.
		  즉, 처음 이용료가 100이었다면 2번째에는 200, 3번째에는 300으로 요금이 인상됩니다.
		
		놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를 return 하도록 solution 함수를 완성하세요.
		단, 금액이 부족하지 않으면 0을 return 하세요.
		
	제한사항
		놀이기구의 이용료 price : 1 ≤ price ≤ 2,500, price는 자연수
		처음 가지고 있던 금액 money : 1 ≤ money ≤ 1,000,000,000, money는 자연수
		놀이기구의 이용 횟수 count : 1 ≤ count ≤ 2,500, count는 자연수
	 
	 
	 */

	public static void main(String[] args) {
		int price = 5;
		int money = 50;
		int cycle = 1;
		int count = 6;
//		int result = 10;
		// 결과 값
		long answer = -1;
		
		// 반복문을 통해 count만큼 초기값이 증가하며, price가 증가하도록 할 수 있다.
		for (int i = 1; i <= count; i++) {
//			int surcharge = price;
			money -= price * i;
			System.out.println( i + "회차 price " + price*i );
			System.out.println( i + "회차 money " + money );
			cycle++;
			// 이때, money는 음수가 되서는 안된다.
			if(money < price) {
				// 부족한돈 : price - money
				answer = (price*cycle) - money;
				break;
			}
			if( money == 0 ) answer = money;
			
						
		}//for
		System.out.println( "남은돈 : " + money );
		
		
		System.out.println( answer );
		
		
		
				
				
		

	}

}
