package backjoon.level03;

import java.util.*;

public class level03_04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 int x = sc.nextInt(); //구매한 총 가격
		 int n = sc.nextInt(); //구매한 물건의 종류

		 int sum = 0;
		 for(int i = 0; i < n; i++) {
			 int a = sc.nextInt();
			 int b = sc.nextInt();
			 
			 sum += (a *b);
		 }
		 if(sum == x) {
			 System.out.println("Yes");
		 }else {
			 System.out.println("No");
		 }
		
		 sc.close();
	}
}
