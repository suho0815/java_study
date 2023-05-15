package study03;

import java.util.*;

public class 하노이탑 {

	// 
	public static void hanoi_top(int n, int from, int temp,  int to) {
		int k = 0;
		if(n == 1) {
//			System.out.println(k);
			System.out.println(from + " " + to);
		}else {
//			k++;
			hanoi_top(n-1, from, to, temp);
			System.out.println(from + " " + to);
			hanoi_top(n-1, temp, from, to);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 원판 갯수

		hanoi_top(n, 1, 2, 3);
	}

}
