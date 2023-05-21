package study03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class 별찍기10_1 {
	static StringBuilder[] sb;
 
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
 
		sb = new StringBuilder[N];
		String s = String.format("%" + N + "s" , ' ');
		for(int i = 0; i < N; i++) {
			sb[i] = new StringBuilder(s);
		}
        
		star(0, 0, N);
		for (int i = 0; i < N; i++) {
			System.out.println(sb[i]);
		}
 	}   
 
	static void star(int x, int y, int N) {
 
		// 더이상 쪼갤 수 없는 블록일 때
		if (N == 1) {
			sb[x].setCharAt(y, '*');
			return;
		}
 
		/*
		   N=27 일 경우 한 블록의 사이즈는 9이고, 
		   N=9 일 경우 한 블록의 사이즈는 3이듯
		   해당 블록의 한 칸을 담을 변수를 의미 size
           
		   count는 별 출력 누적을 의미
		 */
 
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
