package study01;

import java.util.Scanner;

public class Mission07 {
	
	static void grade(int g) {
		
		if(g >= 95) {
			System.out.print("A+");
		}else if(g >= 90) {
			System.out.print("A");
		}else if(g >= 85) {
			System.out.print("B+");
		}else if(g >= 80) {
			System.out.print("B");
		}else if(g >= 75) {
			System.out.print("C+");
		}else if(g >= 70) {
			System.out.print("C");
		}else if(g >= 65) {
			System.out.print("D+");
		}else if(g >= 60){
			System.out.print("D");
		}else {
			System.out.print("F");
		}
		
	}
	
	
	public static void main(String[] args) {
		//시험성적 확인
		
		Scanner sc = new Scanner(System.in);
		System.out.println("성적을 입력하세요:");
		int g = sc.nextInt();
		sc.close();
		
		System.out.printf("%d점 -> ",g);
		grade(g);
	}

}
