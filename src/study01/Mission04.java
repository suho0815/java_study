package study01;

import java.util.Scanner;

public class Mission04 {
	
	public static void main(String[] args) {
		// 이진수
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		String output = "";
		
		if(input < 0) {
			System.out.println("잘 못 입력하셨습니다. 프로그램을 종료합니다.");
			sc.close();
			return;
		}

		while(input >= 2) {
			if ((input % 2) >= 1) {
				output += "1";
			}else {
				output += "0"; 
			}
			input /=2;
		}
		
		if(input == 1) {
			output += "1";
		}else if(input == 0){
			output += "0";
		}
		
		System.out.print("-> ");
		for(int i = output.length()-1; i >= 0; i--) {
			System.out.print(output.charAt(i));
		}
		
		
		sc.close();
	}
}
