package backjoon.level04;

import java.util.*;

public class level04_02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []a = new int[n];
		int max = 0;
		int min = 0;
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n - 1; i++) {
			if (a[i] < a[i+1]) {
				min = a[i];
				max = a[i+1];
			}else {
				min = a[i+1];
				max = a[i];
			}
		}
		System.out.println(min + " "+ max);
		
	}
}
