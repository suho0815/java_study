package study08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 더하기1_2_3 {
	static int[] result;
	
	public static int plus(int n) {

		if(result[n] != 0)
			return result[n];
		
		if(n-3 >= 0) {
			result[n-1] = plus(n-1);
			result[n-2] = plus(n-2);
			result[n-3] = plus(n-3);
		}
		result[n] = result[n-1] + result[n-2] + result[n-3]; 
		
		return result[n];
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		//각 테스트 케이스마다, n을 1, 2, 3의 합으로 나타내는 방법의 수를 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		result = new int[11];
		result[0] = 1;
		result[1] = 2;
		result[2] = 4;
		
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			
			System.out.println(plus(n-1));
		}
		
		
	}

}
