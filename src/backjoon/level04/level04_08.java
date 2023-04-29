package backjoon.level04;

import java.util.*;

public class level04_08 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[10];
		int a2[] = new int[10];
		int cnt = 0;
		
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			
			if(a[i] > 1000 || a[i] < 0) {
				return;
			}
			a2[i] = a[i] % 42;
		}
		
		for(int i =0; i < a2.length; i++) {
			 for(int j = i+1; j < a2.length; j++) {
				 if(a2[i] == a2[j]) {
					 a2[i] = -1;
				 }
			 }
			 if(a2[i] >= 0) {
				 cnt++;
			 }
		}
		System.out.println(cnt);
		
		sc.close();
	}
}
