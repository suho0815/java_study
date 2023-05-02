package backjoon.level06;

import java.util.*;

public class level06_04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //바구니 수
		int m = sc.nextInt(); //순서 회전시킬 바구니
		int a[] = new int[n];
		int b[] = new int[n];
		int temp;
		
		for(int index = 1; index <= n; index++) {
			a[index-1] = index;
			b[index-1] = index;
		}
		
		for(int index = 0; index < m; index++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			
			temp = i-1;
			for(int index2 = k-1; index2 <= j-1; index2++) {
				a[temp] = b[index2];
				temp++;
			}
			
			
			for(int index2 = i-1; index2 < k-1; index2++) {
				a[temp] = b[index2];
				temp++;
			}
			for(int s = 0; s < a.length; s++) {
				b[s] = a[s];
			}
		}

		for(int s = 0; s < a.length; s++) {
			System.out.print(b[s] + " ");
		}
		
		
		sc.close();
		
	}
}
