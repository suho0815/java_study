package study07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 쿼드트리 {
	static int[][] arr;
	static StringBuilder sb = new StringBuilder();
	
	public static void QuadTree(int n, int x, int y) {
		
		
		
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		
		for(int i=0; i < n; i++) {
			String str = br.readLine();
			
			for(int j = 0; j < str.length(); j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		
		QuadTree(n, 0, 0);
		System.out.println(sb);

	}

}
