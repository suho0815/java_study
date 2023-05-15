package study01;

import java.util.Scanner;

public class Mission21 {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 좌표 : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.print("입력 각도 : ");
		int gag = sc.nextInt();
		
		int x1 = (int) ((Math.round(Math.cos(gag)) * x) + (Math.round(-Math.sin(gag)) * y));
		int y1 = (int) ((Math.round(Math.sin(gag)) * x) + (Math.round(Math.cos(gag)) * y));
		
		System.out.printf("출력 좌표: %d, %d", x1, y1);
		
	}

}
