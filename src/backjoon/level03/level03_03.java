package backjoon.level03;

import java.util.*;

public class level03_03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		sc.close();
	}
}
