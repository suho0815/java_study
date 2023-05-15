package study02;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class 두_용액2 {

	public static void main(String[] args) throws IOException{
		
		//입력
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 용액의 수
		if(n < 2 || n > 100000) {
			sc.close();
			return;
		}
		int[] v = new int[n]; // 용액의 특성 값
		
		for(int i = 0; i < v.length; i++) {
			v[i] = sc.nextInt();
		}
		sc.close();
		
		//풀이
		Arrays.sort(v);

		int lval = v[0];
		int rval = v[v.length-1];
		int temp = Math.abs(v[0] + v[v.length-1]);
		
		for(int i = 0; i < v.length; i++) {
			for(int j = v.length-1; j < i; j--) {
				int s = Math.abs(v[i] + v[j]); 
				
				if(temp > s) {
					temp = s;
					lval = v[i];
					rval = v[j];
				}
				
				if(s == 0 ){
					break;
				}
				
			}
		}
		
		//출력
		System.out.println(lval + " " + rval);

		
	}
}
