package backjoon.level06;

import java.util.*;

public class level06_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int piece[] = new int[6];
		int piece1[] = {1, 1, 2, 2, 2, 8};
		
		for(int i =0; i< piece.length; i++) {
			piece[i] = sc.nextInt();
			
			System.out.print(piece1[i] - piece[i] + " ");
		}

		sc.close();
	}
}
