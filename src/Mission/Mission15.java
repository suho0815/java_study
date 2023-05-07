package Mission;

import java.util.Scanner;

public class Mission15 {
	
	
	public static void main(String[] args) {
		// 정렬 기초(버블정렬)
		
		int []a = new int[7];
		
		//랜덤으로 배열 값 입력 받기
		for(int i = 0; i< a.length; i++) { 
			a[i] = (int)(Math.random()*45) + 1;
		}
		
		System.out.print("입력(정렬 전) :");
		for(int i = 0; i< a.length; i++) { 
			System.out.print(a[i]+ " ");
		}
		
		int temp = 0;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 1; j < a.length-i; j++) {
				if (a[j-1] > a[j]) {
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
		
		// 배열 출력
		System.out.println();
		System.out.print("출력(정렬 후) :");
		for(int i = 0; i< a.length; i++) { 
			System.out.print(a[i]+ " ");
		}
		
	}

}
