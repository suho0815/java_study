package backjoon.level05;

import java.util.*;

public class level05_09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String n1 = sc.next();
		String n2 = sc.next();
		String r1 = "",r2 = "";
		
		if(n1.equals(n2) || n1.length() != 3 || n2.length() != 3) {
			return;
		}
		
		for(int i = n1.length() -1; i >= 0 ; i--) {
			r1 += n1.charAt(i);
			r2 += n2.charAt(i);
		}
		
		int r1_1 = Integer.parseInt(r1);
		int r2_1 = Integer.parseInt(r2);
		
		if(r1_1 > r2_1) {
			System.out.println(r1_1);
		}else {
			System.out.println(r2_1);
		}
		
		sc.close();
	}

}
