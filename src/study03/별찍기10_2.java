package study03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class 별찍기10_2 {
	static StringBuilder[] sb;
 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
 
		sb = new StringBuilder[N];
		String s = String.format("%" + N + "s" , ' ');
		for(int i = 0; i < N; i++) { //공백 달아놓고
			sb[i] = new StringBuilder(s);
		}
        
		star(0, 0, N); //별 찍기
		for (int i = 0; i < N; i++) {
			System.out.println(sb[i]);
		}
 	}   
 
	static void star(int x, int y, int N) {
 
		if (N == 1) {
			sb[x].setCharAt(y, '*');
			return;
		}
 
		int size = N / 3;
		int count = 0;
		for (int i = x; i < x + N; i += size) {
			for (int j = y; j < y + N; j += size) {
				count++;
				if (count != 5) { 
					star(i, j, size);
				} 
			}
		}
	}
}
