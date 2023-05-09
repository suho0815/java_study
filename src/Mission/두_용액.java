package Mission;

import java.util.ArrayList;
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

	static void sortdata(int[] v) {
		for(int i = 0; i < v.length; i++) {
			for(int j = 1; j < v.length - i; j++) {
				int temp = 0;
				if(v[j-1] > v[j]) {
					temp = v[j-1];
					v[j-1] = v[j];
					v[j] = temp;
				}
			}
		}
	}
	
	static void find0(int[] v) {
		int pl = 0;
		int pr = v.length -1;
		
		while(true) {
			
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
		sortdata(v);
		
		for(int i = 0; i <v.length; i++) {
			System.out.print(v[i]+ " ");
		}
		
		//출력
	}
}
