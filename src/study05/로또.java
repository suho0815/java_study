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
			int []visited = new int[6]; // 몇번 인덱스까지 순회하며 경우의 수를 확인 했는가? 
			int []results = new int[6]; 
			Stack<Integer> stack = new Stack<Integer>();
			for(int i = 0; i < k; i++) {
				s[i] = Integer.parseInt(st.nextToken());
				
				if(stack.size() < 6) {
					stack.push(s[i]);
					results[i] = s[i];
				}
			}
			
			int ptemp = 0; //s[0] 번째 값이 k개의 입력값을 돌며 경우의 수를 확인 해봤는가?
			int p = 0;
			do {
				if(stack.size() == 6) { 
					p = stack.pop();
					p = Arrays.asList(s).indexOf(p) + 1;
					visited[5] = Arrays.asList(s).indexOf(p);
					for(int i = 0; i < results.length; i++) {
						sb.append(results[i]).append(" ");
					}
					sb.append("\n");
					
				}
				
				
			}while(!stack.isEmpty());
			
			
//			int px = 0; //
//			int temp = s[px];
//			int py = 0;
//			results[0] = s[0];
//			while(px < k-1) {
//				
//				if(stack.isEmpty()){
//					px++;
//					stack.push(s[px]);
//					results[px] = s[px];
//				}else {
//					py++;
//					stack.push(s[py]);
//					results[py] = s[py];
//				}
//				
//				if(stack.peek() == results[py]) {
//					py++;
//					if(py >= k -1) {
//						stack.pop();
//						py = Arrays.asList(s).indexOf(stack.peek()) + 1;
//					}
//				}
//				
//				if(stack.size() == results.length) {
//					for(int i = 0; i <results.length; i++) {
//						System.out.print(results[i]);
//					}
//					System.out.println();
//				}
//
//			}
			
			
		}
		
	}

}
