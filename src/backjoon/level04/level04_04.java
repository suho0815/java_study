package backjoon.level04;

import java.util.*;

public class level04_04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int []a = new int[9];
		
		int max= 0;
		int p = 0;
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			
			if(a[i] > 100 || a[i] < 0) {
				return;
			}
			
			if(max < a[i]) {
				max = a[i];
				p = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(p);
		sc.close();
	}
}
