package study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class p {
	int index;
	int data;
	
	public p(int index, int data) {
		this.index = index;
		this.data = data;
	}
}

public class 탑 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		if (n < 2 || n >500000) {
			return;
		}
//		int v[] = new int[n];
		Stack<p> h = new Stack<>(); //높이
//		Stack<Integer> v = new Stack<>(); //출력할 인덱스
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		for(int i = 0; i < n; i++) { 
			//토큰으로 찢은 문자열을 버퍼로 한번에 입력 받음과 동시에 스택의 데이터와 비교하여 바로 출력
			int temp = Integer.parseInt(st.nextToken());

			while(!h.isEmpty())	{
				if(h.peek().data > temp) {
					System.out.print(h.peek().index + " ");
					break;
				}else if(h.peek().data < temp) {
					h.pop();
				}
			}

			if(h.isEmpty()) {
				System.out.print(0 + " ");
			}
			
			h.push(new p((i+1), temp));
//			v[i] = Integer.parseInt(st.nextToken());
		}
		

	}

}
