package study01;

import java.util.Scanner;

public class Mission06 {
	
	public static void main(String[] args) {
		//예금 복리 계산
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원금을 입력하세요:");
		int a = sc.nextInt();
		System.out.println("만기 년수를 입력하세요:");
		int n = sc.nextInt();
		System.out.println("이율을 입력하세요:");
		double r = sc.nextDouble();
		sc.close();
		
		double s = 1+(r/100);
		for(int i = 1; i < n; i++) {
			s *= (1+(r/100));
		}
		s *= a;
		System.out.printf("원금 : %d원, 만기 : %d년, 연 복리 : %.2f%% \n", a, n, r);
		System.out.printf("만기금액 : %d원\n", Math.round(s));
	}

}
