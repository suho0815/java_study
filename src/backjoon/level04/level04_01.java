package backjoon.level04;

import java.util.*;

public class level04_01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []a = new int[n];
		int s =0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		int v = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			if (a[i] == v) {
				s++;
			}
		}
		System.out.println(s);
		
	}
}
