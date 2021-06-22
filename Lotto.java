package lotto;

import java.util.Scanner;

/**
 * 로또를 1~5개 자동번호 구매하고 당회차 번호를 맞춘 상금을 출력해 봅시다.
==================== 로또 판매점 ====================
1.로또구입	2.소지금확인	3.종료
=====================================================
원하는 메뉴 선택 >> 1
---------- 로또 구입 ----------
몇 장을 구입하시겠습니까? >> 5
---------- 내 번호 ----------
[4, 8, 14, 33, 36, 37]
[7, 25, 32, 35, 39, 40]
[15, 20, 25, 32, 41, 42]
[9, 13, 25, 28, 30, 42]
[14, 18, 22, 32, 38, 45]
로또 추첨 중 ...
---------- 당첨 확인 ----------
1회차 당첨번호 : [9, 10, 20, 23, 37, 42]
[4, 8, 14, 33, 36, (37)] => 낙첨
[7, 25, 32, 35, 39, 40] => 낙첨
[15, (20), 25, 32, 41, (42)] => 낙첨
[(9), 13, 25, 28, 30, (42)] => 낙첨
[14, 18, 22, 32, 38, 45] => 낙첨
 * 
 * */

public class Lotto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LottoShop a = new LottoShop();
		int[] ball = a.createBall();
		
		for(int i : ball) {
			System.out.print(i + " ");
		}
		
		
		
		while(true) {
			System.out.println("==================== 로또 판매점 ====================");
			System.out.println("1.로또구입	      2.지금까지 사용한 금액	   3.종료");
			System.out.println("==================================================");
			System.out.print("원하는 메뉴 선택 >> ");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.print("몇 장을 구입하시겠습니까? >> ");
				int paper = sc.nextInt();
				
			} else if(choice == 2) {
				
			} else if(choice == 3) {
				break;
			}
	
		}
		
		
	}
}












































