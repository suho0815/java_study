package study04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Z2 {

	public static int cnt = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int sidelen = (int) Math.pow(2, n); // 한 변의 길이
		
		while(sidelen > 1) {
			if(sidelen / 2 > r && sidelen / 2 > c) {
				
			}else if(sidelen /2 > r && sidelen / 2 <= c ) {
				cnt = cnt + ((sidelen * sidelen) / 4);
				
				c = c - (sidelen / 2);
			}else if(sidelen / 2 <= r && sidelen / 2 > c) {
				cnt = cnt + ((sidelen * sidelen) / 4) * 2;
				
				r = r - (sidelen / 2);
			}else if(sidelen / 2 <= r && sidelen / 2 <= c) {
				cnt = cnt + ((sidelen * sidelen) / 4) * 3;
				
				r = r - (sidelen / 2);
				c = c - (sidelen / 2);
			}
			 sidelen = sidelen/2;
		}
		System.out.println(cnt);
	}
}
