package backjoon.level03;

import java.util.*;

public class level03_05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		 int n = sc.nextInt(); //정수 (4<=n<=1000 ,4의배수)
		 
		 if (n < 4 || n > 1000 || n%4 > 0) {
			 return ;
		 }
		 
		 for (int i=0; i < n/4; i++ ) {
			 System.out.print("long ");
		 }
		System.out.println("int");
		
		sc.close();
	}
}
