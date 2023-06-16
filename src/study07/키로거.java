package study07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 키로거 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			Stack<Character> st = new Stack<>();
			Stack<Character> temp = new Stack<>();
			
			for(int j = 0; j < str.length(); j++) {
				switch(str.charAt(j)) {
					case '<':
						if(st.size() > 0 ) {
							char te = st.pop();
							temp.push(te);
						}
						break;
					case '>':
						if(temp.size() > 0) {
							char te = temp.pop();
							st.push(te);
						}
						break;
					case '-':
						if(!st.isEmpty()) {
							st.pop();
						}
						break;
					default :
						st.push(str.charAt(j));
				}
			}
			
			while(!st.isEmpty()) {
				temp.push(st.pop());
			}
			while(!temp.isEmpty()) {
				sb.append(temp.pop());
			}
			sb.append('\n');
		}
		System.out.println(sb);

	}

}
