package study04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Z {

	public static int count = 0;
	
	public static void findValue(int n, int r, int c) {
		int nsize = (int) Math.pow(2, n);
		int row_mid = nsize/2;
		int col_mid = nsize/2;
		int block = ( (nsize * nsize) / 4);
		
		if(n == 1) {
			System.out.println(count);
			return;
		}
		
		if(row_mid <= r && col_mid <= c) { //(0,0)
			findValue(n/2 , r, c);
		}else if(row_mid <= r && col_mid >= c) { // (0, 1)
			count = count + block;
			findValue(n/2 , r, c);
		}else if(row_mid >= r && col_mid <= c) { // (1, 0)
			count = count + (block*2);
			findValue(n/2 , r, c);
		}else if(row_mid >= r && col_mid >= c) { // (1, 1)
			count = count + (block*3);
			findValue(n/2 , r, c);
		}
		
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		findValue(n, r, c);
		
	}

}
