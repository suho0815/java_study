package study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class 별찍기10 {

	static int x = 1;
	static int y = 1;
	static int na = 9;
	
	static void star(int n) {

//		if(n == 3) {
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 3; j++) {
//				if(i == 1 && j == 1) {
//					System.out.print(" ");
//					y++;
//				}else {
//					System.out.print("*");
//					y++;
//				}
//			}
//			if(y >= n) {//
//				System.out.println();
//			}
//			
//		}
//	}
		
		
//		if(n == 1) {
//			System.out.print("*");
//			y++;
//			if(x %(n/3) == 1 && y % (n/3) == 1) {
//				System.out.print(" ");
//				y++;
//			}
////			if((i/3)%3 == 1 && (j/3)%3 == 1) {
//			if(y >= n) {
//				System.out.println();
//				x++;
//			}
//		}else {
//			for(int i = 0; i < n/3; i++) {
//				for(int j = 0; j < n/3; j++) {
//					if(i == 1 && j == 1) { //공백
//						continue;
//					}else {
//						star(n/3);
//					}
//				}
//				
//			}
//		}
		
		if(n == 1) {
			System.out.print("*");
			y++;
			if(y >= n) {
				System.out.println();
				x++;
			}
		}else if(x %(n/3) == 1 && y % (n/3) == 1) {
			System.out.print(" ");
			y++;
		}
			
		star(n/3);
		
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(br.readLine());
		
		
		int n = 9;
		
		star(n);
		
		
		
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 3; j++) {
//				if(i == 1 && j == 1) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		
	}

}
