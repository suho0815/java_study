package study04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 스택수열 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder stringbuilder = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> st = new Stack<>();
		
		int temp = 0; // 스택에 저장할 수열 (1부터 n까지 push면 +, pop이면 -)
		for(int i = 0; i < n; i++) {
			int k = Integer.parseInt(br.readLine()); // 입력
			
			if(k > temp) { //푸쉬해서 수열을 pop하는 경우
				for(int j = temp + 1; j <= n; j++) {
					st.push(j);
					stringbuilder.append("+").append("\n");
					if(k == j) {
						st.pop();
						stringbuilder.append("-").append("\n");
						temp = j;
						break;
					}
				}
			}else if(st.peek() == k){ // 이미 스택에 입력값이 있어 pop으로 뽑아내는 경우
				st.pop();
				stringbuilder.append("-").append("\n");
				
			}else { // 프로그램 종료
				System.out.println("NO");
				return;
			}
			
		}
		System.out.println(stringbuilder);

	}

}
