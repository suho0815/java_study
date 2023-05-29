package study04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Z {

	public static int cnt = 0;
	
	public static void findZ(int sidelen, int r, int c) {
		
		int row_mid = sidelen/2;
		int col_mid = sidelen/2;
		int block = ( (sidelen * sidelen) / 4); // 한 블록의 크기
		
		if(sidelen == 1) {
			System.out.println(cnt);
			return;
		}
		
		if(row_mid > r && col_mid > c) { //(0,0)
			findZ(sidelen/2 , r, c);
		}else if(row_mid > r && col_mid <= c) { // (0, 1)
			cnt = cnt + block;
			findZ(sidelen/2 , r, c - col_mid);
		}else if(row_mid <= r && col_mid > c) { // (1, 0)
			cnt = cnt + (block*2);
			findZ(sidelen/2 , r - row_mid, c);
		}else if(row_mid <= r && col_mid <= c) { // (1, 1)
			cnt = cnt + (block*3);
			findZ(sidelen/2 , r - row_mid, c - col_mid);
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int sidelen = (int) Math.pow(2, n); // 한 변의 길이
		
		findZ(sidelen, r, c);
	}
}
