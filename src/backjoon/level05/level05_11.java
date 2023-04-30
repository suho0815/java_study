package backjoon.level05;

import java.util.*;

public class level05_11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 100; i++) {
			if(!sc.hasNextLine()) { // 키보드 입력 있는지 없는지 검사
				break;
			}
			
			String s = sc.nextLine();
			
			if(s.length() > 100 || s.isEmpty() || s.charAt(0) == ' '|| s.charAt(s.length()-1) == ' ') {
				break;
			}
			
			System.out.println(s);
		}
		
		sc.close();
	}

}
