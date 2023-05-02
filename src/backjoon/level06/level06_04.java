package backjoon.level06;

import java.util.*;

public class level06_04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //바구니 수
		int m = sc.nextInt(); //순서 회전시킬 바구니
		int a[] = new int[n];
		
		for(int index = 1; index <= n; index++) {
			a[index-1] = index;
		}
		
		for(int index = 0; index < m; index++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			int temp = i-1;
			int temp2;
			for(int index2 = k-1; index2 < j-1; index2++) {
				temp2 = a[temp];
				a[temp] = a[index2];
				a[temp+1] = temp2;
				temp++;
				
			}
			temp = k-1;
			for(int index2 = i-1; index2 < k-2; index2++) {
				temp2 = a[temp];
				a[temp] = a[index2];
				a[temp+1] = temp2;
				temp++;
			}
			for(int s = 0; s < a.length; s++) {
				System.out.print(a[s] + " ");
			}
			
		}
		
		
		System.out.println();
		
		
	}
}
