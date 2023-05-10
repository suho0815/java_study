package Mission;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class solution {
	int san ;
	int alkali;
	
	public solution(int san, int alkali) {
		this.san = san;
		this.alkali = alkali;
	}
	
	public int getsan() {
		return san;
	}
	
	public int getalkali() {
		return alkali;
	}
	
}
public class 두_용액 {

	static void find0(int[] v) {
		int pl = 0;
		int pr = v.length -1;
		
		while(pl < pr) {
			
		}
		
	}
	
	public static void main(String[] args) {
		
		//입력
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n < 2 || n > 100000) {
			return;
		}
		int[] v = new int[n];
//		ArrayList<solution> f = new ArrayList<>();
		
		for(int i = 0; i < v.length; i++) {
			v[i] = sc.nextInt();
		}
		sc.close();
		//풀이
		Arrays.sort(v);
		
		
		for(int i = 0; i <v.length; i++) {
			System.out.print(v[i]+ " ");
		}
		
		//출력
	}
}
