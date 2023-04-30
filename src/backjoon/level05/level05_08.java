package backjoon.level05;

import java.util.*;

public class level05_08 {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		s = s.trim(); // 문자열 공백 제거 (앞뒤 공백만 제거함, 중간공백은 안지워줌)
		
		if(s.isEmpty()) {
			System.out.println("0");
		}else {
			System.out.println(s.split(" ").length); // 공백단위로 문자열 잘라 배열로 반환 후 배열길이 반환
		}
		
		sc.close();
	}

}
