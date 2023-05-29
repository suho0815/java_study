package study04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 개똥벌레2 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		float down[] = new float[n/2]; // 석순
		float up[] = new float[n/2]; // 종유석
		for(int i = 1; i <= n; i++) { 
			int obstacle = Integer.parseInt(br.readLine());
			
			if(i % 2 == 0) { // 짝수(종유석)
				up[(i - 1) / 2] = h - obstacle;
				
			}else { // 홀수(석순)
				down[i / 2] = obstacle;
			}
		}
		Arrays.sort(down);
		Arrays.sort(up);
		
		int min = Integer.MAX_VALUE; //파괴해야 하는 장애물의 최솟값
		int mingugan = 1; // 파괴해야 하는 장애물이 최솟값인 구간의 수
		//소수점으로 줄 수 밖에 없네,,
		for(float i = 0.5f ; i <= h; i++) { 
			int s = (Arrays.binarySearch(down, i)* -1);
            int j = (Arrays.binarySearch(up, i)* -1);
            
            int sum = up.length - s + j;
            if(min > sum) {
				min = sum;
				mingugan = 1;
			}else if(min == sum) {
				mingugan += 1;
			}
            
		}
		System.out.println(min + " " + mingugan);
			
	}
}
