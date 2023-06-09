package study04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 개똥벌레 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int[] gugan = new int[h]; // 구간별 파괴해야 하는 장애물 수
		for(int i = 1; i <= n; i++) { 
			int obstacle = Integer.parseInt(br.readLine());
			
			if(i % 2 == 0) { // 짝수(종유석)
				for (int j = h; j > h - obstacle; j--) {
					gugan[j - 1] += 1;
				}
			}else { // 홀수(석순)
				for(int j = 1; j <= obstacle; j++) {
					gugan[j - 1] += 1;
				}
			}
		}
		
		int min = gugan[0]; //파괴해야 하는 장애물의 최솟값
		int mingugan = 1; // 파괴해야 하는 장애물이 최솟값인 구간의 수
		for(int i = 1; i < gugan.length; i++) { 
			if(min > gugan[i]) {
				min = gugan[i];
				mingugan = 1;
			}else if(min == gugan[i]) {
				mingugan += 1;
			}
		}
		System.out.println(min + " " + mingugan);
		
	}
}
