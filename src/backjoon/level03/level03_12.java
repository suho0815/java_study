package backjoon.level03;

import java.util.*;

public class level03_12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
//			if((a >= 10 || a <= 0) || (b >= 10 || b <= 0)) {	
//				break;
//			}
			System.out.println(a+b);
		}
		sc.close();
	}
}
