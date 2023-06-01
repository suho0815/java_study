package study05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 문자열폭발2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Character> stack = new Stack<>();
		//StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		String boom = br.readLine();
		
		br.close();
		
		//int p = 0;
		int boom_len = boom.length();
		int str_len = str.length();
		
		for (int i = 0; i < str_len; i++) {
			stack.push(str.charAt(i));
			int st_size = stack.size();
			if(st_size >= boom_len) {
				int cnt = 0;
				for(int j = 0; j < boom_len; j++) { //boom 인지 확인
					if(stack.get(st_size - boom_len + j) == boom.charAt(j)) {
						cnt++;
					}
				}
				if(cnt == boom_len) { //boom 이면 pop
					for(int j = 0; j < boom_len; j++) {
						stack.pop();
					}
				}
			}
			
		}
		
		if(stack.isEmpty()) {
			System.out.println("FRULA");
			return;
		}
		String result = "";
		while (!stack.isEmpty()) {
			//sb.insert(0, stack.pop());
			result = stack.pop() + result;
		}
		System.out.println(result);
		
	}

}
