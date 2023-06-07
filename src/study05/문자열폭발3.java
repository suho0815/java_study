package study05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class 문자열폭발3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Character> stack = new Stack<>();
		String str = br.readLine();
		String boom = br.readLine();
		
		br.close();
		int p = 0;
		for (int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
			
			if(stack.size() >= boom.length()) {
				int cnt = 0;
				for(int j = 0; j < boom.length(); j++) { //boom 인지 확인
					if(stack.get(stack.size() - boom.length() + j) == boom.charAt(j)) {
						cnt++;
					}
				}
				if(cnt == boom.length()) { //boom 이면 pop
					for(int j = 0; j < boom.length(); j++) {
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
			result = stack.pop() + result;
		}
		System.out.println(result);
		
	}

}
