package study05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

class print{
	int index;
	int imp;
	
	public print(int index, int imp){
		this.index = index;
		this.imp = imp;
	}
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getImp() {
		return imp;
	}
	public void setImp(int imp) {
		this.imp = imp;
	}
}

public class 프린터큐 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine()); //테스트케이스 수
		
		int []cnt = new int[t]; // 각 테스트케이스에 대한 결과 값
		for(int i = 0; i < t; i++) { // 테스트케이스 수 만큼 반복
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken()); //문서의 갯수
			int m = Integer.parseInt(st.nextToken()); //찾고자하는 문서의 index
			
			Queue<print> qu = new LinkedList<>();
			//우선순위 큐 쓰면 쉽게 풀릴듯..?
			PriorityQueue<Integer> impqu = new PriorityQueue<>(Collections.reverseOrder());
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < n; j++) {
				int p = Integer.parseInt(st.nextToken()); //중요도 입력
				impqu.add(p);
				qu.add(new print(j, p));
			}
//			while(!impqu.isEmpty()) {
//				System.out.println(impqu.poll());
//			}
			
			while(!qu.isEmpty()) {
				int temp_index = qu.peek().getIndex();
				int temp_imp = qu.peek().getImp();
				qu.remove();
				if(impqu.peek() == temp_imp) {
					impqu.remove();
					cnt[i] += 1;
					if(temp_index == m) {
						break;
					}
				}else {
					qu.add(new print(temp_index, temp_imp));
				}
			}
			
		}
		
		for(int i = 0; i < t; i++) {
			System.out.println(cnt[i]);
		}
		
	}
}
