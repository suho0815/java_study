package backjoon.level04;

import java.util.*;

public class level04_09 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //바구니 개수
		int m = sc.nextInt(); // 공 넣을 횟수
		
		int []a = new int[n];
		int lc = 0;
		int rc = 0;
		
		for(int i = 1; i <= n; i++) {
			a[i-1] = i;
		}
		
		for(int i = 0; i < m; i++) {
			lc = sc.nextInt();
			rc = sc.nextInt();
			
			for(int j = lc-1; j < rc-1; j++) {
				for(int k = rc-1; k > j; k--) {
					int temp = 0;
					temp = a[k];
					a[k] = a[k-1];
					a[k-1] = temp;
				}
			}
		}
		
		for(int i =0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		sc.close();
	}
}
