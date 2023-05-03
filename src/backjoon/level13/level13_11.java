package backjoon.level13;

import java.util.*;

public class level13_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Vector<Integer> v1 = new Vector<>();
		Vector<Integer> v2 = new Vector<>();
		
		// 좌표 입력
		while(n != v1.size()) {
			int x = sc.nextInt();
			v1.add(x);
			v2.add(x);
		}
		
		int m = v1.get(0);
		for(int i = 0; i < v1.size(); i++) {
			if (v1.get(i) < m) {
				m = v1.get(i);
			}
		}
		Collections.sort(v2); // 오름차순 정렬
		
		for(int i = 0; i <v1.size(); i++) {
			for(int j = 0; j < v2.size(); j++) {
				if(v1.get(i) == v2.get(j)) {
					v1.set(i, j);
				}
			}
		}
		for (int i = 0; i < v1.size(); i++) {
			System.out.print(v1.get(i) + " ");
		}
		
		
	}
}
