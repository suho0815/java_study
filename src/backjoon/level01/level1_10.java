package backjoon.level01;

import java.util.*;

public class level1_10 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int temp;
			
			if(a < 99 || a > 1000) {
				System.out.println("잘못입력하셨습니다.");
				return;
			}
			
			if(b < 99 || b > 1000) {
				System.out.println("잘못입력하셨습니다.");
				return;
			}
			
			temp = b%10;
			System.out.println(a*temp);
			temp = (b%100)-temp;
			System.out.println((a*temp)/10);
			temp = b-(b%100);
			System.out.println((a*temp)/100);
			System.out.println(a*b);
	}

}


