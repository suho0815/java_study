package study05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;


public class 프린터큐2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine()); //테스트케이스 수
		
		int []cnt = new int[t];
		for(int i = 0; i < t; i++) { // 테스트케이스 수 만큼 반복
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken()); //문서의 갯수
			int m = Integer.parseInt(st.nextToken()); //찾고자하는 문서의 index
			
			Queue<print> qu = new LinkedList<>();
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < n; j++) {
				
				int p = Integer.parseInt(st.nextToken()); //중요도 입력
				qu.add(new print(j, p));
			}

			
//			while(!qu.isEmpty()) {
//				int temp_index = qu.peek().getIndex();
//				int temp_imp = qu.peek().getImp();
//				qu.remove();
//				if(impqu.peek() == temp_imp) {
//					impqu.remove();
//					cnt[i] += 1;
//					if(temp_index == m) {
//						break;
//					}
//				}else {
//					qu.add(new print(temp_index, temp_imp));
//				}
//			}
			
		}
		
//		for(int i = 0; i < t; i++) {
//			System.out.println(cnt[i]);
//		}
		
	}
}
