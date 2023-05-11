package Mission;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 두_용액 {

	public static void main(String[] args) throws IOException{
		
		//입력
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt(); // 용액의 수
//		if(n < 2 || n > 100000) {
//			sc.close();
//			return;
//		}
//		int[] v = new int[n]; // 용액의 특성 값
//		ArrayList<solution> f = new ArrayList<>();
		
//		for(int i = 0; i < v.length; i++) {
//			v[i] = sc.nextInt();
//		}
//		sc.close();
		
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
		
//		for(int i = 0; i < v.length; i++) {
//			System.out.print(v[i] + " ");
//		}
//		System.out.println();

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
		
//		int lval = v[0];
//		int rval = v[v.length-1];
//		int temp = Math.abs(v[0] + v[v.length-1]);
//		for(int i = 0; i < v.length; i++) {
//			for(int j = v.length-1; j < i; j--) {
//				int s = Math.abs(v[i] + v[j]); 
//				
//				if(temp > s) {
//					temp = s;
//					lval = v[i];
//					rval = v[j];
//				}
//				
//				if(s == 0 ){
//					break;
//				}
//				
//			}
//		}
		
		//출력
		System.out.println(lval + " " + rval);
//		System.out.printf("%d %d\n", lval, rval);
		
	}
}
