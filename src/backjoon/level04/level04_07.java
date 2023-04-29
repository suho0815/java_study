package backjoon.level04;

import java.util.*;

public class level04_07 {
	
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		int a[] = new int[30];
		int n[] = new int[28];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = i+1;
		}
		
		// 입력
		for(int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
			if( n[i]<0 || n[i]>30){
				return;
			}
		}
		
		//중복 값 검사
		for(int i = 0; i < n.length; i++) {
			for(int j = i+1; j < n.length; j++) {
				if(n[i] == n[j]) {
					return;
				}
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < n.length; j++) {
				if(a[i] == n[j]) {
					a[i] = 0;
				}
			}
		}

		for(int i = 0; i < a.length; i++) {
			if(a[i] != 0) {
				System.out.println(a[i]);
			}
		}
		
		sc.close();
	}
}
