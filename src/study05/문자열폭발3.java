package study05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class 문자열폭발3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		Stack<Character> stack = new Stack<>();
		ArrayList<Character> list = new ArrayList<>();
		//StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		String boom = br.readLine();
		
		br.close();
		
		//int p = 0;
		
		for (int i = 0; i < str.length(); i++) {
			list.add(str.charAt(i));
			
			if(list.size() >= boom.length()) {
				boolean fire = true;
				for(int j = 0; j < boom.length(); j++) { //boom 인지 확인
					if(list.get(list.size() - boom.length() + j) != boom.charAt(j)) {
						fire = false;
						break;
					}
				}
				if(fire) { //boom 이면 boom값 삭제
					for(int j = 1; j <= boom.length(); j++) {
						list.remove(list.size() - j);
					}
				}
			}
			
		}
		
		if(list.isEmpty()) {
			System.out.println("FRULA");
			return;
		}else {
			for(char c : list) {
				System.out.print(c);
			}			
		}
		
//		if(stack.isEmpty()) {
//			System.out.println("FRULA");
//			return;
//		}
//		String result = "";
//		while (!stack.isEmpty()) {
//			//sb.insert(0, stack.pop());
//			result = stack.pop() + result;
//		}
//		System.out.println(result);
		
	}

}
