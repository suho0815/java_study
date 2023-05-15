package study01;

import java.util.Scanner;

public class Mission16 {
	
	static int[] merge(int a[], int b[]) {
		int []c = new int[a.length*2];
		int index1 = 0;
		int index2 = 0;
		for(int i = 0; i < c.length; i++) {
			if(i % 2 == 0) {
				c[i] = a[index1];
				index1++;
			}else {
				c[i] = b[index2];
				index2++;
			}
		}
		return c;
	}
	
	public static void main(String[] args) {
		// 배열 합치기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("배열 길이 입력 :");
		int n = sc.nextInt();
		int []a = new int[n];
		int []b = new int[n];
		int []c = new int[2*n];
		//랜덤으로 배열 값 입력 받기
		for(int i = 0; i< a.length; i++) { 
			a[i] = (int)(Math.random()*45) + 1;
			b[i] = (int)(Math.random()*45) + 1;
		}
		System.out.println();
		System.out.println("배열 a");
		for(int i = 0; i< a.length; i++) { 
			System.out.print(a[i]+ " ");
		}
		
		System.out.println();
		System.out.println("배열 b");
		for(int i = 0; i< b.length; i++) { 
			System.out.print(b[i]+ " ");
		}
		
		c = merge(a,b);
				
		// 배열 출력
		System.out.println();
		System.out.println("배열 c");
		for(int i = 0; i< c.length; i++) { 
			System.out.print(c[i]+ " ");
		}
		
	}

}
