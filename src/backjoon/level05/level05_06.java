package backjoon.level05;

import java.util.*;

public class level05_06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		for(int i = (int)'a'; i <= (int)'z'; i++) {
			System.out.print(s.indexOf(i)+ " ");
		}
		
		sc.close();
	}

}
