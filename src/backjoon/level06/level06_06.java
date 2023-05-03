package backjoon.level06;

import java.util.*;

public class level06_06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String upperstr = "";
		int []carr = new int[26];
		int maxc = 0;
		int maxi = 0;
		
		upperstr = str.toUpperCase(); // 입력받은 문자열 대문자로 변경
		
		for(int i = 0; i < str.length() ; i++) {
			carr[upperstr.charAt(i) - 65]++;
		}
		
		for(int i = 0; i < carr.length; i++) {
			if(maxc < carr[i]) {
				maxc = carr[i];
				maxi = i;
			}
		}
		
		for(int i = 0; i < carr.length; i++) {
			if(maxc == carr[i] && i != maxi) {
				System.out.println("?");
				return;
			}
		}
		System.out.println((char)(maxi + 65));
		
	}
}
