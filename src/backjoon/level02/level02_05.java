package backjoon.level02;

import java.util.*;

public class level02_05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if (h < 0 || h >24) {
			return;
		}else if (m < 0 || m > 60) {
			return;
		}
		
		m -= 45;
		
		if(m < 0) {
			h--;
			m = m + 60;
			if(h < 0) {
				h = 23;
			}
		}
		System.out.println(h + " " + m);
	}
	
}
