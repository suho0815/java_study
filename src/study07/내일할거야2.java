//package study07;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.StringTokenizer;
//
//class homework {
//	int d, t;
//	int start_day, end_day; //과제 시작한 날, 과제 끝낸 날
//	
//	public homework(int d, int t) {
//		this.d = d;
//		this.t = t;
//	}
//
//}
//public class 내일할거야2 {
//
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int n = Integer.parseInt(br.readLine());
//		
//		homework[] hws = new homework[n]; 
//		StringTokenizer st;
//		for(int i =0; i< n; i++) {
//			st = new StringTokenizer(br.readLine());
//			int d = Integer.parseInt(st.nextToken());
//			int t = Integer.parseInt(st.nextToken());
//			
//			hws[i] = new homework(d, t);
//		}
//		
//		// 마감 일 기준으로 내림차순 정렬
//		Comparator<homework> ch = new Comparator<homework>() {
//			@Override
//			public int compare(homework o1, homework o2) {
//				return o1.t - o2.t;
//			}
//		};
//		Arrays.sort(hws, ch.reversed());
//		
//		//정렬 확인
////		for (int i = 0; i < hws.length; i++) {
////			System.out.printf("d : %d  t : %d " , hws[i].d, hws[i].t);
////			System.out.println();
////		}
//		
//		
//		boolean []holyday = new boolean[hws[0].t];
//		int j = 0;
//		for(int i = holyday.length -1; i > 0; i--) {
//			holyday[i] = true;
//			
//			while(j > n) {
//				if(hws[j].t - (hws[j].d - 1) < i) {
//					holyday[i] = false;
//					break;
//				}else if(hws[j].t - (hws[j].d - 1) == i) {
//					holyday[i] = false;
//					j++;
//					break;
//				}
//			}
//		}
//		
//		int cnt = 0;
//		for(int i = 0; i < holyday.length; i++) {
//			if(holyday[i] == true) {
//				cnt++;
//			}else {
//				cnt = 0;
//			}
//		}
//		
//		
//	}
//}
