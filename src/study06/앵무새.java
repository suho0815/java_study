package study06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 앵무새 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Queue<String> []s = new LinkedList[n]; //큐 배열 선언
		for (int i = 0; i < n; i++) { 
			s[i] = new LinkedList<>();
		}
		Queue<String> result = new LinkedList<>();
		
		StringTokenizer st;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				s[i].add(st.nextToken());
			}
			//System.out.println(s[i]);
		}
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			result.add(st.nextToken());
		}
		//System.out.println(result);
		
		// 비교 시작
		while(!result.isEmpty()) {
			int cnt = 0;
			//중복되는 단어가 있으면 impossible
			
			
			//비교
			for(int i = 0; i < n; i++) {
				if(s[i].isEmpty()) {
					continue;
				}
				if(s[i].peek().equals(result.peek())) {
					s[i].remove();
					result.remove();
					cnt++;
				}
			}
			if(cnt == 0) {
				System.out.println("Impossible");
				return;
			}
			
		}
		System.out.println("Possible");
		
	}

}
