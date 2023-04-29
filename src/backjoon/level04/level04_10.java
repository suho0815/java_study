package backjoon.level04;

import java.util.*;

public class level04_10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 시험 본 과목 갯수
		double max = 0;
		double sum = 0;
		double score[] = new double[n];
		
		for(int i = 0; i < score.length; i++) {
			score[i] = sc.nextDouble();
			if(score[i] > 100 || score[i] < 0) {
				return;
			}
			if(max < score[i]) {
				max = score[i];
			}
		}
		
		for(int i = 0; i < score.length; i++) {
			score[i] = score[i]/max *100;
			sum += score[i];
		}
		
		System.out.println(sum/n);
		
		sc.close();
	}
}
