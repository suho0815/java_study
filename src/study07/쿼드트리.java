package study07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 쿼드트리 {
	static int[][] arr;
	static StringBuilder sb = new StringBuilder();
	
	public static void QuadTree(int n, int x, int y) {
		boolean isok = true;
		
		for(int i = x; i < x+n; i++) {
			for(int j = y; j < y+n; j++) {
				if(arr[i][j] != arr[x][y]) {
					isok = false;
				}
			}
		}
		
		if(isok) {
			sb.append(arr[x][y]);
			return;
		}
		
		int size = n/2;
		
		sb.append('(');
		QuadTree(size, x, y); // 왼쪽 위
		QuadTree(size, x , y + size); // 오른쪽 위
		QuadTree(size, x + size, y); // 왼쪽 아래
		QuadTree(size, x + size, y + size); // 오른쪽 아래
		sb.append(')');
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		
		for(int i=0; i < n; i++) {
			String str = br.readLine();
			
			for(int j = 0; j < str.length(); j++) {
				arr[i][j] = (str.charAt(j) )-48;
			}
		}
		
		QuadTree(n, 0, 0);
		System.out.println(sb);

	}

}
