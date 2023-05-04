package backjoon.level06;

import java.util.*;

public class level06_07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		
		for(int i = 0; i < c; i++) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int sum = 0;
			int cnt = 0;
			double avg = 0.0;
			for(int j = 0; j < a.length; j++) {
				a[j] = sc.nextInt();
				if(a[j] < 0 || a[j] > 100) {
					return;
				}
				sum += a[j];
			}
			avg = sum / a.length;
			for(int j = 0; j < a.length; j++) {
				if((double) a[j] > avg) {
					cnt++;
				}
			}
			System.out.println(String.format("%.3f%%", (double) cnt/n*100));
		}
		sc.close();
	}
}
