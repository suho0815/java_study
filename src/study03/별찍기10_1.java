package study03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class 별찍기10_1 {
	static char[][] arr;
	
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

        arr = new char[N][N];
		star(0, 0, N);
		for (int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(arr[i][j] == '0') {
					System.out.println(' ');
				}else {
					System.out.print(arr[i][j]);
				}
			}
			System.out.println();
		}
		
	}

	static void star(int x, int y, int N) {
		
		
		if (N == 1) {
			arr[x][y] = '*';	
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