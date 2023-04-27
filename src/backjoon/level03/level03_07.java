package backjoon.level03;

import java.util.*;

public class level03_07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int i=1; i <= t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Case #"+i+": " + (a + b));
		}
		sc.close();
	}
}
