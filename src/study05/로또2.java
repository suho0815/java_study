package study05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class 로또2 {
	public static int k ;
	public static boolean []visited ; // 로또 번호 받음? (중복 검사를 위한 배열) 
	public static int []s; // 로또 번호의 집합
	public static int[] results = new int[6]; // 결과 값
	public static StringBuilder sb = new StringBuilder();
	
	public static void backtracking(int cnt, int state) { // cnt : 로또 번호 개수, state : 오름차순으로 찍어야 하므로 재귀로 넘길 때 for문에 초기값으로 사용
		if(cnt == 6) {
			for(int re : results) {
				sb.append(re).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = state; i < k; i++) {
			if(!visited[i]) { 
				visited[i] = true;
				results[cnt] = s[i];
				backtracking(cnt + 1, i);
				visited[i] = false; // 막히거나 로또 번호 조합을 찾았으면 되돌아와 다음거 검사하기 위해 false
			}
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			k = Integer.parseInt(st.nextToken());
			if(k == 0) {
				break;
			}
			
			s = new int[k];
			visited = new boolean[k];
			for(int i = 0; i < k; i++) {
				s[i] = Integer.parseInt(st.nextToken());
			}
			
			backtracking(0, 0);
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
