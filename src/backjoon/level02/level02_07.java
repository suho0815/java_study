package backjoon.level02;

import java.util.*;

public class level02_07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int m = 0;
		
		if (a == b && b == c) { // 같은 눈이 3개 인 경우
			m = 10000 + (a * 1000);
		}else if (a== b || b==c || a==c) { //같은 눈이 2개 인 경우
			if(a == b) {
				m = 1000 + (a * 100);
			}else if(b == c) {
				m = 1000 + (b * 100);
			}else if(a == c) {
				m = 1000 + (a * 100);
			}
		}else { // 모두 다른 눈이 나오는 경우
			if(a > b) {
				m = a;
				if(a > c) {
					m = a;
				}else {
					m = c;
				}
			}else {
				m = b;
				if(b>c) {
					m = b;
				}else {
					m = c;
				}
			}
			m = m*100;
		}
		System.out.println(m);
		
	}
	
}
