package study07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class homework {
	int d, t;
	int start_day, end_day; //과제 시작한 날, 과제 끝낸 날
	
	public homework(int d, int t) {
		this.d = d;
		this.t = t;
	}

}

public class 내일할거야 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		homework[] hws = new homework[n]; 
		StringTokenizer st;
		for(int i =0; i< n; i++) {
			st = new StringTokenizer(br.readLine());
			int d = Integer.parseInt(st.nextToken());
			int t = Integer.parseInt(st.nextToken());
			
			hws[i] = new homework(d, t);
		}
		
		// 마감 일 기준으로 내림차순 정렬
		Comparator<homework> ch = new Comparator<homework>() {
			@Override
			public int compare(homework o1, homework o2) {
				return o1.t - o2.t;
			}
		};
		Arrays.sort(hws, ch.reversed());
		
		//정렬 확인
//		for (int i = 0; i < hws.length; i++) {
//			System.out.printf("d : %d  t : %d " , hws[i].d, hws[i].t);
//			System.out.println();
//		}
		
		int day = 0; //며칠 동안 놀 수 있음? 
		hws[0].start_day = hws[0].t - hws[0].d + 1;
		hws[0].end_day = hws[0].t;
		for(int i = 1; i < n; i++) {
			// 현재과제 마감일과 다음과제 시작일이랑 겹치는 경우 (다음 과제때문에 현재과제를 일찍 시작해야 하는 경우)
			if(hws[i-1].start_day <= hws[i].t) { // 조건 수정( 다음 과제 때문에 일찍 해야하는 경우 조건에 맞지 않아 수정)
				hws[i].end_day = hws[i-1].start_day -1;
				hws[i].start_day = hws[i].end_day - hws[i].d + 1;
			}else {
				// 과제를 마감일까지 끝내도 되는 경우
				hws[i].end_day = hws[i].t;
				hws[i].start_day = hws[i].end_day - hws[i].d + 1;
			}
			
			// 최대 몇 일 연속으로 놀 수 있는지 계산 (이거 아님,, 내일부터 연속으로 몇일까지 놀수 있는가?를 구해야 됨)
//			System.out.println((hws[i-1].start_day-1));
//			System.out.println((hws[i].end_day+1));
//			System.out.println((hws[i-1].start_day-1) - (hws[i].end_day+1));
//			if(day < (hws[i-1].start_day-1) - (hws[i].end_day+1) +1)
//				day = (hws[i-1].start_day-1) - (hws[i].end_day+1) +1;
		}
		
		if(day < hws[n-1].start_day -1)
			day = hws[n-1].start_day -1;
		
		System.out.println(day);
		
	}
}
