package study05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class 로또 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			StringBuilder sb = new StringBuilder();
			int k = Integer.parseInt(st.nextToken());
			
			if(k == 0) {
				break;
			}
			
			int []s = new int[k];
			int []visited = new int[6]; // s[]배열의 몇번 인덱스까지 순회하며 경우의 수를 확인 했는가? 
			int []results = new int[6]; 
			Stack<Integer> stack = new Stack<Integer>();
			for(int i = 0; i < k; i++) {
				s[i] = Integer.parseInt(st.nextToken());
				
				if(stack.size() < 6) {
					stack.push(s[i]);
					results[i] = s[i];
					visited[i] = i;
				}
			}
			
			int ptemp = 6; //results[] 배열 순회할 인덱스 
			int p = 6; //s[] 배열 순회할 인덱스
			do {
				// 결과가 나오면
				if(stack.size() >= 6) { 
					stack.pop();
					p = visited[5] + 1;
					visited[5]++;
					for(int i = 0; i < results.length; i++) {
						sb.append(results[i]).append(" ");
					}
					sb.append("\n");
					ptemp--;
				}
				
				//막히면 되돌리기
				if(visited[ptemp] >= k -1) {
					if(ptemp - 1 < 0) {
						break;
					}
					visited[ptemp - 1]++;
					visited[ptemp] = visited[ptemp - 1] + 1;
					ptemp--;
					p = visited[ptemp]++;
					stack.pop();
				}else {
					stack.push(s[p]);
					results[ptemp] = s[p];
					visited[ptemp]++;
					p = visited[ptemp];//
					ptemp++;
//					if(ptemp <= results.length -1) {
//						
//					}
				}

			}while(visited[0] < k-1 || visited[5] < k-1);
			
			System.out.println(sb);

			
			
		}
		
	}

}
