package Mission;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 탑 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		if (n < 2 || n >500000) {
			return;
		}
		int v[] = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			v[i] = Integer.parseInt(st.nextToken());
		}
		
		//풀이
		int val[] = new int[n];
		val[0] = 0;
		for(int i = 1; i < v.length; i++) {
			for(int j = i-1; j >= 0; j--) {
				if(v[i] < v[j]) {
					val[i] = j+1;
					j = -1;
				}
			}
		}
		
		//출력
		for(int i = 0; i < val.length; i++) {
			System.out.print(val[i]+ " ");
		}
	}

}
