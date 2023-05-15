package study01;

import java.util.Scanner;

public class Mission09 {
	
	static void switch_12ganji(int year) {
		switch(year % 12) {
		case 0:
			System.out.printf("%d년 => 원숭이띠", year);
			break;
		case 1:
			System.out.printf("%d년 => 닭띠", year);
			break;
		case 2:
			System.out.printf("%d년 => 개띠", year);
			break;
		case 3:
			System.out.printf("%d년 => 돼지띠", year);
			break;
		case 4:
			System.out.printf("%d년 => 쥐띠", year);
			break;
		case 5:
			System.out.printf("%d년 => 소띠", year);
			break;
		case 6:
			System.out.printf("%d년 => 호랑이띠", year);
			break;
		case 7:
			System.out.printf("%d년 => 토끼띠", year);
			break;
		case 8:
			System.out.printf("%d년 => 용띠", year);
			break;
		case 9:
			System.out.printf("%d년 => 뱀띠", year);
			break;
		case 10:
			System.out.printf("%d년 => 말띠", year);
			break;
		case 11:
			System.out.printf("%d년 => 양띠", year);
			break;
		}
	}
	
	static void if_12ganji(int year) {
		if(year % 12 == 0) {
			System.out.printf("%d년 => 원숭이띠", year);
		} else if(year % 12 == 1) {
			System.out.printf("%d년 => 닭띠", year);
		} else if(year % 12 == 2) {
			System.out.printf("%d년 => 개띠", year);
		} else if(year % 12 == 3) {
			System.out.printf("%d년 => 돼지띠", year);
		} else if(year % 12 == 4) {
			System.out.printf("%d년 => 쥐띠", year);
		} else if(year % 12 == 5) {
			System.out.printf("%d년 => 소띠", year);
		} else if(year % 12 == 6) {
			System.out.printf("%d년 => 호랑이띠", year);
		} else if(year % 12 == 7) {
			System.out.printf("%d년 => 토끼띠", year);
		} else if(year % 12 == 8) {
			System.out.printf("%d년 => 용띠", year);
		} else if(year % 12 == 9) {
			System.out.printf("%d년 => 뱀띠", year);
		} else if(year % 12 == 10) {
			System.out.printf("%d년 => 말띠", year);
		} else if(year % 12 == 11) {
			System.out.printf("%d년 => 양띠", year);
		}
		
	}
	
	
	public static void main(String[] args) {
		// switch or if-else
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출생연도를 입력하세요:");
		int year = sc.nextInt();
		
		//swich문 사용
//		switch_12ganji(year);
		
		//if-else문 사용
		if_12ganji(year);
		
	}

}
