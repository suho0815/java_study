package study09;

import java.util.Scanner;

public class 핑핑이 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int p = sc.nextInt();
		
		int[][] arr = new int[n][n]; 
		int[] direction = {0, 1, 2, 3};
		
		int x = n/2;
		int y = n/2;
		int direction_idx = 0;
		int m = 1;
		
		while(true) {
			if(x < 0 || y < 0 || x >= n || y >= n) break;
			
			switch(direction_idx) {
			case 0:
				
				break;
			case 1:
				
				break;
			case 2:
				break;
			case 3:
				break;
			
			}
				
			
		}
		

	}

}
