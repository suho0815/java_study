package Mission;

import java.util.Scanner;

public class Mission01 {

	static void TotalSum(int n) {
		int sum = 0;
		System.out.print("전체 합 :");
		for (int i = 1; i <= n; i++) {
			sum += i;
			if(n == i) {
				System.out.printf(" %d = %d\n", i, sum);
			}else {
				System.out.printf(" %d +", i);
			}
		}
	}
	
	static void oddSum(int n) {
		int sum = 0;
		System.out.print("홀수 합 :");
		for (int i = 1; i <= n; i+=2) {
			sum += i;
			if(n == i || n-1 == i) {
				System.out.printf(" %d = %d\n", i, sum);
			}else {
				System.out.printf(" %d +", i);
			}
		}
	}
	
	static void evenSum(int n) {
		int sum = 0;
		System.out.print("짝수 합 :");
		for (int i = 2; i <= n; i+=2) {
			sum += i;
			if(n == i || n-1 == i) {
				System.out.printf(" %d = %d\n", i, sum);
			}else {
				System.out.printf(" %d +", i);
			}
		}
	}
	
	public static void main(String[] args) {
		// 수치 합
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int n = sc.nextInt();
		
		while(n <= 0) {
			System.out.println("잘못 입력하셨습니다. 0 보다 큰 하나의 정수를 입력하세요.");
			n = sc.nextInt();
		}
		sc.close();
		
		TotalSum(n);
		oddSum(n);
		evenSum(n);
		
//		int sumOdd = 0;
//		int sumEven = 0;
//		int sumTotal = 0;
		
//		for (int i = 1; i <= n; i++) {
//			if(i % 2 ==0) {
//				sumOdd += i;
//			}else {
//				sumEven += i;
//			}
//		}
		
	}

}
