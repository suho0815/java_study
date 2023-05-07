package Mission;

import java.util.Scanner;

public class Mission19 {

	public static int fibo(int inp) {
		int result = 0;
		
		if(inp == 0) {
			result = inp;
		}else if(inp == 1) {
			result = inp;
		} else {
			result = fibo(inp-2) + fibo(inp-1);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		//피보나치 수열 메소드 작성
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int input = sc.nextInt();
		int []a = new int[input];
		if(input < 0 ) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		System.out.print("출력 : ");
		for(int i = 0; i < a.length; i++) {
			a[i] = fibo(i);
			if(i == a.length-1) {
				System.out.print(a[i]+"\n");
			}else {
				System.out.print(a[i] + ", ");
			}
		}
		
	}
}
