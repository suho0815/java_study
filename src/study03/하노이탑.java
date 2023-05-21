package study03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class 하노이탑 {
 
	static StringBuilder stringbuilder = new StringBuilder();
	
	public static void hanoi_top(int n, int from, int temp,  int to) throws IOException {

		
		if (n == 1) {
			stringbuilder.append(from).append(" ").append(to).append("\n");

		} else {
			hanoi_top(n - 1, from, to, temp);
			stringbuilder.append(from).append(" ").append(to).append("\n");
			hanoi_top(n - 1, temp, from, to);

		}
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 원판 갯수
		br.close();
		
		if(n > 100 || n < 1) {
			return;
		}

		int re = (int) Math.pow(2, n)-1;
		System.out.println(re);
		hanoi_top(n, 1, 2, 3);
		System.out.println(stringbuilder);
		
	}

}
