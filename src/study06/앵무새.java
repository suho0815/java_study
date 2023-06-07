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
		
		int n = Integer.parseInt(br.readLine()); //앵무새 수
		Queue<String> []s = new LinkedList[n]; //큐 배열 선언(각각의 앵무새가 기억하고 있는 문장)
		for (int i = 0; i < n; i++) { 
			s[i] = new LinkedList<>();
		}
		Queue<String> result = new LinkedList<>(); //받아 적은 문장
		
		StringTokenizer st;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				s[i].add(st.nextToken());
			}
		}
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			result.add(st.nextToken());
		}
		
		// 비교 시작
		while(!result.isEmpty()) {
			int cnt = 0; //순서에 맞게 나올 수 있는 문장인지 확인하기 위한 변수
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
		// 앵무새가 다 말했음?
		// 앵무새가 더 말할게 있더라도 순서에 맞게 완성만되면 되는줄,,
		for(int i= 0; i < n; i++) {
			if(!s[i].isEmpty()) {
				System.out.println("Impossible");
				return;
			}
		}
		
		System.out.println("Possible");
		
	}

}
