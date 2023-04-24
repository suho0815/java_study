package backjoon.level02;

import java.util.*;

public class level02_03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a <= 1 && a >= 4000) {
			return;
		}
		
		if(a%4 ==0 && a%100 > 0 || a%400 == 0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}	
	}
	
}
