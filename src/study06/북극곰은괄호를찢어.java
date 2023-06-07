package study06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 북극곰은괄호를찢어 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); 
		String s = br.readLine();
		
		Stack<Character> stack = new Stack<>();
		char[] sc = s.toCharArray();
		int day = 0;

		//반례
		/*
		10
((()))))((
결과 : 3
		*/
		for(int i = 0; i < sc.length; i++) {
			if(stack.isEmpty()) {
				stack.push(sc[i]);
				if(day < stack.size()) {
					day = stack.size();
				}
				continue;
			}
			switch(sc[i]) {
			case '(':
				if(stack.peek() == ')') { // X인 경우
					stack.pop();
				}else { //(O)인 경우
					stack.push(sc[i]);
				}
				break;
			case ')':
				if(stack.peek() == ')') { // )X( 인 경우 ,,
					stack.push(sc[i]);
				}else { // O 인 경우
					stack.pop();
				}
				break;
			}
			if(day < stack.size()) {
				day = stack.size();
			}
		}
		
		//스택에 값이 남아 있으면 -1
		if(!stack.isEmpty()) {
			day = -1;
		}
		System.out.println(day);
		
	}

}
