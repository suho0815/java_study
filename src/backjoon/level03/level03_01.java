package backjoon.level03;

import java.util.*;

public class level03_01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		
		for(int i = 1; i <10; i++) {
			System.out.println(a +" * "+i + " = "+(a*i));
		}
		
	}
}
