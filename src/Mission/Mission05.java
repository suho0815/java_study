package Mission;

import java.util.Scanner;

public class Mission05 {
	static int rem;
	
	public static int calc(int max, int min) {
		rem = max % min;
		if (rem == 0) {
			return min;
		} else { //rem이 0이 아니면 -> max = min, min = rem 2번 반복
			return calc(min,rem);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 두개의 정수 입력 받아 최대공약수와 최소공배수 구해서 출력
		// ex) 입력 : 12, 18 -> 최대공약수 : 6, 최소공배수 : 36 
		// 입력 받은 두개의 정수 중 큰 수 max , 작은 수 min
		// rem = max % min
		// rem이 0이면 -> 최대공약수 = 작은 정수, 최소공배수 = 두 정수의 곱 / 최대공약수
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int a, b, max, min, rem;
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		// 큰 수와 작은 수 구하기
		if (a >= b) {
			max = a;
			min = b;
		}else {
			max = b;
			min = a;
		}
		
		System.out.printf("최대공약수 : %d, 최소공배수 : %d", calc(max, min), (max*min)/calc(max, min));
		
//		rem = max % min;
//		if (rem == 0) {
//			System.out.println(String.format("최대공약수 : %d, 최소공배수 : %d", min, (max*min)/min));
//		} else { //rem이 0이 아니면 -> max = min, min = rem 2번 반복
//			if (rem == 0) {
//				System.out.println(String.format("최대공약수 : %d, 최소공배수 : %d", min, (max*min)/min));
//			} else { //rem이 0이 아니면 -> max = min, min = rem 2번 반복
//				System.out.println(String.format("최대공약수 : %d, 최소공배수 : %d", min, rem));
//			}
//		}
		
		
	}

}
