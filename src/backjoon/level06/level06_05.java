package backjoon.level06;

import java.util.*;

public class level06_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String restr = "";
		
		for(int i = str.length()-1; i >= 0; i--) {
			restr += str.charAt(i);
		}
		
		if(restr.equals(str)) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}		
		sc.close();
		
	}
}
