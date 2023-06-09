package study06;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class 별찍기11_2 {
	static StringBuilder[] sb ;
	static char[][] star = {
			{' ',' ','*',' ',' '},
			{' ','*',' ','*',' '},
			{'*','*','*','*','*'},
	};
	public static void star(int y, int x, int n) {
		
		if (n == 3) {
			for(int i = 0; i <star.length; i++) {
				for(int j = 0; j <star[0].length; j++) {
					sb[y+i].setCharAt(x+j, star[i][j]);
				}
			}
			
			return;
		}
		
		int size = n/2;
		star(y, x+size, size);
		star(y+size, x, size);
		star(y+size, x+n, size);
		
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		sb = new StringBuilder[n];
		for(int i = 0; i < n; i++) {
			sb[i] = new StringBuilder(String.format("%"+ (n*2) +"s", ' '));
		}
		/*
		 세로 : 3 X 2^k = n
		 가로 : 3 X 2^k+1 = n*2
		*/
		star(0 , 0, n);
		for(int i = 0; i< n; i++) {
			System.out.println(sb[i]);
		}
		
	}

}