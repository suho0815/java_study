package study05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 문자열폭발2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		String boom = br.readLine();
		
		br.close();
		
		long beforeTime = System.currentTimeMillis();
		
		int p = 0;
		
		for (int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
			
			if(stack.size() >= boom.length()) {
				p = stack.size() - boom.length();
				int cnt = 0;
				for(int j = 0; j < boom.length(); j++) { //스택의 끝에 char데이터들을 boom과 비교해서 맞으면 pop
					if(stack.get(p + j) == boom.charAt(j)) {
						cnt++;
					}
				}
				if(cnt == boom.length()) {
					for(int j = 0; j < boom.length(); j++) {
						stack.pop();
					}
				}
			}
			
		}
		
		if(stack.isEmpty()) {
			System.out.println("FRULA");
		}else {
			for(int i = 0; i < stack.size(); i++) {
				sb.insert(0, stack.pop());
			}
			System.out.println(sb);
		}
		
		
		long afterTime = System.currentTimeMillis(); 
		long secDiffTime = (afterTime - beforeTime)/1000;
		System.out.println("시간차이(m) : "+secDiffTime);
	}

}
