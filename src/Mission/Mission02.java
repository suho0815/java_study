package Mission;

import java.util.Scanner;

public class Mission02 {
	
	public static void main(String[] args) {
		// 도형 면적 계산
		Scanner sc = new Scanner(System.in);
		
		System.out.println("삼각형 또는 사각형을 선택하세요.");
		System.out.println("1.삼각형 , 2.사각형");
		System.out.print("입력 : ");
		int p = sc.nextInt();
		
		if(p == 1) {
			System.out.println("삼각형의 밑변과 높이를 입력하세요!");
			int width = sc.nextInt();
			int height = sc.nextInt();
			double area = width * height / 2;
			System.out.printf("밑변 - %d, 높이 - %d, 면적 : %.2f \n",width, height, area);
			
		}else if(p == 2) {
			System.out.println("사각형의 너비와 높이를 입력하세요!");
			int width = sc.nextInt();
			int height = sc.nextInt();
			int area = width * height;
			System.out.printf("너비 - %d, 높이 - %d, 면적 : %d \n",width, height, area);
			
		}else {
			System.err.println("잘 못 입력하셨습니다.");
		}
		
		sc.close();
	}
}
