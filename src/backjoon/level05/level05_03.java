package backjoon.level05;

import java.util.*;

public class level05_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i <t; i++) {
			String s = sc.nextLine();
			
			System.out.print(s.charAt(0));
			System.out.println(s.charAt(s.length()-1));
		}
		
		sc.close();
	}

}
