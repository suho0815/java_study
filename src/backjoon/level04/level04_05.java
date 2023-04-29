package backjoon.level04;

import java.util.*;

public class level04_05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //바구니 개수
		int m = sc.nextInt(); // 공 넣을 횟수
		
		int []a = new int[n];
		int []r = new int[3];
		
		for(int i = 0; i < m ;i++) {
			for(int j = 0; j < r.length; j++) {
				r[j] = sc.nextInt();
			}
			
			for(int k= r[0]-1; k <= r[1]-1; k++) {
				a[k] = r[2];
			}
			
		}
		
		for(int i =0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		sc.close();
	}
}
