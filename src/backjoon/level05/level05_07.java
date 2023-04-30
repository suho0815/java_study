package backjoon.level05;

import java.util.*;

public class level05_07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			int r = sc.nextInt();
			String s = sc.next();
			
			if(s.length() > 20 || s.length() < 1) {
				return;
			}
			
			for(int j = 0; j < s.length(); j++) {
				for(int k = 0; k < r; k++) {
					System.out.print(s.charAt(j));	
				}
			}
			System.out.println();
		}
		
		sc.close();
	}

}
