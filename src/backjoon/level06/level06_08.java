package backjoon.level06;

import java.util.*;

public class level06_08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		String croa[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String str = sc.nextLine();
		
		
		
		for(int i = 0; i < croa.length; i++) {
			for(int j = 0; j < str.length(); j++) {
				if (str.indexOf(croa[i], j) >= 0) {
					j += croa[i].length() - 1;
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}
}
