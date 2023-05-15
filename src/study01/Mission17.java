package study01;

import java.util.Scanner;

public class Mission17 {
	
	static void cnt(String str) {
		int cnt = 0;//모음
		char []a = {'A', 'E', 'I', 'O', 'U'};
		char []st = new char[str.length()];
		str = str.toUpperCase();
		str = str.replaceAll("[^A-Z]", "");
		str = str.replace(" ", "");
		st = str.toCharArray();
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < st.length; j++) {
				if(st[j] == a[i]) {
					cnt++;
				}
			}
		}
		
		System.out.printf("자음 %d개, 모음 %d개\n", str.length()-cnt, cnt);
	}
	
	
	public static void main(String[] args) {
		// 자모 계산
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영어 문자열을 입력하세요:");
		String str = sc.nextLine();
		sc.close();
		
		cnt(str);
		
	}

}
