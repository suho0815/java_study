package Mission;

import java.util.Scanner;

public class Mission12 {
	
	
	public static void main(String[] args) {
		// 두 직선의 교차점
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 직선의 좌표를 입력하세요(x1, y1) – (x2, y2) 순으로 입력 할 것!");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		System.out.println("두번째 직선의 좌표를 입력하세요(x3, y3) – (x4, y4) 순으로 입력 할 것!");
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		int x4 = sc.nextInt();
		int y4 = sc.nextInt();
		
		
		int m1 = (y2-y1)/(x2-x1); //첫번째 좌표의 기울기
		int m2 = (y4-y3)/(x4-x3); //두번째 좌표의 기울기
		
		while(m1 == m2) {
			System.out.println("두 직선은 평행하여 교차점이 없습니다. 다시 입력해 주세요.");
			System.out.println("첫번째 직선의 좌표를 입력하세요(x1, y1) – (x2, y2) 순으로 입력 할 것!");
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			System.out.println("두번째 직선의 좌표를 입력하세요(x3, y3) – (x4, y4) 순으로 입력 할 것!");
			x3 = sc.nextInt();
			y3 = sc.nextInt();
			x4 = sc.nextInt();
			y4 = sc.nextInt();
		}
		sc.close();
		int x = (m1*x1-y1-m2*x3+y3) / (m1-m2);
		int y = m1*(x-x1)+y1;
		System.out.printf("(%d, %d)", x, y);
	}

}
