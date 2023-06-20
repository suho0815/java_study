package study08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 더하기1_2_3_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//각 테스트 케이스마다, n을 1, 2, 3의 합으로 나타내는 방법의 수를 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int[] tmp = new int[t]; // 입력값을 저장할 배열
		int max = 0; // 반복 횟수를 줄이기 위해 테스트케이스 중 최대값을 구함
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			tmp[i] = n;
			if(max < n) {
				max = n;
			}
		}
		
		int[] result = new int[max];
		result[0] = 1;
		result[1] = 2;
		result[2] = 4;
		
		for(int i = 3; i < max; i++) {
			result[i] = result[i -1] + result[i -2] + result[i -3];
		}
		for(int i = 0; i < t; i++) {
			System.out.println(result[tmp[i] - 1]);
		}
		
	}

}
