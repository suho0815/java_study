package study08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 더하기1_2_3 {

	public static int plus(int n) {
		
		return 0;
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		//각 테스트 케이스마다, n을 1, 2, 3의 합으로 나타내는 방법의 수를 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			
		}
		
		
	}

}
