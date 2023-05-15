package study01;

import java.util.Scanner;

public class Mission03 {
	
	public static void main(String[] args) {
		// 소수 판단
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int n = sc.nextInt();
		while(n <= 0) {
			System.out.println("잘못 입력하셨습니다. 0 보다 큰 하나의 정수를 입력하세요.");
			n = sc.nextInt();
		}
		sc.close();
		
		for(int i = 2; i < n; i++) { //소수 판단
			if(n % i == 0) {
				System.out.println("소수가 아닙니다.");
				return;
			}
		}
		System.out.println("소수입니다.");
	}
}
