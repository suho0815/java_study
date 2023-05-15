package study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 두_용액 {

	public static void main(String[] args) throws IOException{
		
		//입력
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 용액 수
		if(n < 2 || n > 100000) {
			br.close();
			return;
		}
		int[] v = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			v[i] = Integer.parseInt(st.nextToken());
		}
		br.close();
		
		//풀이
		Arrays.sort(v);

		int pl = 0; //배열의 첫 시작을 참조할 변수
		int pr = v.length -1; //배열의 마지막을 참조할 변수
		int temp = Integer.MAX_VALUE; // 임시로 두 용액의 특성 값의 합이 0에 가까운 변수
		int lval = v[pl];
		int rval = v[pr];
		while(pl < pr) {
			int s = v[pl] + v[pr];
			
			if(temp > Math.abs(s)) {
				temp = Math.abs(s);
				lval = v[pl];
				rval = v[pr];
			}
			
			if(s > 0) {
				pr -=1;
			}else if(s < 0) {
				pl +=1;
			}else if(s == 0) {
				break;
			}
			
		}
		

		//출력
		System.out.println(lval + " " + rval);
//		System.out.printf("%d %d\n", lval, rval);
		
	}
}
