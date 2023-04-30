package backjoon.level05;

import java.util.*;

public class level05_10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int num = 0;
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(c >= 'A' && c <= 'C') { //문자형(char) 끼리의 연산의 결과는 int형으로 나온다
				num += 3;
			} else if(c >= 'D' && c <= 'F') {
				num += 4;
			} else if(c >= 'G' && c <= 'I') {
				num += 5;
			} else if(c >= 'J' && c <= 'L') {
				num += 6;
			} else if(c >= 'M' && c <= 'O') {
				num += 7;
			}else if(c >= 'P' && c <= 'S') {
				num += 8;
			}else if(c >= 'T' && c <= 'V') {
				num += 9;
			}else if(c >= 'W' && c <= 'Z') {
				num += 10;
			}
		}
		System.out.println(num);
		
		sc.close();
	}

}
