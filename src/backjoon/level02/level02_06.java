package backjoon.level02;

import java.util.*;

public class level02_06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		int cm = sc.nextInt();
		
		if (cm < 0 || cm > 1000) {
			return;
		}
		
		m = m + cm;
		if(m /60 >= 1) {
			h += (m / 60);
			m = (m % 60);
			if(h >= 24) {
				h = h -24;
			}
		}
		System.out.println(h + " " + m);
		
		
	}
	
}
