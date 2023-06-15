package study07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 키로거 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Character> st = new Stack<>();
		Queue<Character> temp = new LinkedList<>();
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			
			for(int j = 0; j < str.length(); j++) {
				switch(str.charAt(j)) {
					case '<':
						if(st.size() > 0 ) {
							
						}else {
							continue;
						}
					case '>':
						if(temp.size() > 0) {
							
						}else {
							continue;
						}
					case '-':
						if(st.peek() != null) {
							st.pop();
						}else {
							continue;
						}
					default :
						st.push(str.charAt(j));
				}
			}
					
			
			
		}
		

	}

}
