package backjoon.level06;

import java.util.*;

public class level06_06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String upperstr = "";
		int []carr = new int[26];
		
		upperstr = str.toUpperCase(); // 입력받은 문자열 대문자로 변경
		System.out.println(upperstr);
		
		for(int i = 0; i < str.length() ; i++) {
			carr[str.charAt(i)-65]++;
		}
		
		
	}
}
