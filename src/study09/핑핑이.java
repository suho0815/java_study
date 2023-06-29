package study09;

import java.util.Scanner;

public class 핑핑이 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int p = sc.nextInt();
		int[][] arr = new int[n][n];
		int direction_idx = 0;
		
		int x = n/2, y = n/2;
		
		int m = 1, mc = 1; //이동 횟수
		int v = 1; //값
		arr[x][y] = v;
		v++;
		while(true) {
			
			switch(direction_idx) {
			case 0: // 위쪽
				for(int i = 0; i < m; i++) {
					
//					else {
						x--;
						arr[x][y] = v;
						
//					}
					if(v >= n*n) break;
					v++;
				}
				break;
			case 1: //오른쪽
				for(int i = 0; i < m; i++) {
					if(v >= n*n) break;
					else {
						y++;
						arr[x][y] = v;
						v++;
					}
				}
				break;
			case 2: //아래쪽
				for(int i = 0; i < m; i++) {
					if(v >= n*n) break;
					else {
						x++;
						arr[x][y] = v;
						v++;
					}
				}
				break;
			case 3: //왼쪽
				for(int i = 0; i < m; i++) {
					if(v >= n*n) break;
					else {
						y--;
						arr[x][y] = v;
						v++;
					}
				}
				break;
			}
			
			if(v >= n*n) break;
			direction_idx = (direction_idx+1) % 4;
			if(mc >= 2) {
				mc = 1;
				m++;
			}else {
				mc++;
			}
			
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(p == arr[i][j]) {
					x = i + 1;
					y = j + 1;
				}
				sb.append(arr[i][j] + " ");
			}
			sb.append('\n');
		}
		sb.append(x + " " + y);
		System.out.println(sb);
	}
}
