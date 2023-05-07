package Mission;

import java.util.Scanner;

public class Mission10 {
	
	static void printgugudan(int dan) {
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%3d *%3d = %3d\t", dan-1, i, (dan-1)*i);
			System.out.printf("%3d *%3d = %3d\t", dan, i, dan*i);
			System.out.printf("%3d *%3d = %3d\n", dan+1, i, (dan+1)*i);
		}
	}
	
	public static void main(String[] args) {
		// 구구단
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단수를 입력하세요: ");
		int dan = sc.nextInt();
		
		printgugudan(dan);

	}

}
