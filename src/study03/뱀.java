package study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class p { // 뱀의 위치 좌표를 담을 객체 (방향 전환하는 시점의 좌표가 필요함)
	int row;
	int col;
	
	public p(int row, int col) {
		this.row = row;
		this.col = col;
		
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}
	
}
public class 뱀 {

	static int snakeLen = 1; //뱀의 몸 길이 
	static int snakeHead = 0; //현재 뱀의 머리 방향, direction배열의 인덱스로 사용
	static int time = 0; //시간
	
	public static void snakeMove(Queue<p> snake, int x, char c) { //snakeMove(뱀, 시간, 뱀의 머리를 전환할 방향)
		// 뱀의 머리 방향으로 x만큼 이동
		p tmp = snake.peek();
		int templen = snakeLen;
		switch(snakeHead) {
		case 0: // R
//			snake.add(new p(tmp.getRow() + x, tmp.getCol()));
			for(int i = 0; i < x; i++) {
				snake.add(new p(tmp.getRow() + x, tmp.getCol()));
				snake.remove();
			}
			
			if(templen > tmp.getRow()) {
				templen -= tmp.getRow();
				
			}
			
			time += x;
			break;
		case 1: // B
		
			
			
			time += x;
			break;
		case 2: // L
		
			
			time += x;
			break;
		case 3: // T
			
			
			time += x;
			break;
		}
		
		// 뱀이 벽이나 자기자신의 몸에 부딪히는지 검사 
		
		
		// 이동 후 뱀의 머리 방향 전환
		if(c == 'D') {
			snakeHead++;
			if(snakeHead >= 4) {
				snakeHead = 0;
			}
		}else if(c =='L') {
			snakeHead--;
			if(snakeHead < 0) {
				snakeHead = 3;
			}
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken()); // 보드 크기 입력 n * n
		
		st = new StringTokenizer(br.readLine(), " ");
		int k = Integer.parseInt(st.nextToken()); // 사과의 개수 입력
		
		
		p[] apple = new p[k];
		for(int i =0; i < k; i++) { // 사과의 위치 입력
			st = new StringTokenizer(br.readLine(), " ");
			int row = Integer.parseInt(st.nextToken()); //행
			int col = Integer.parseInt(st.nextToken()); //열
			
			apple[i] = new p(row, col);
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		int l = Integer.parseInt(br.readLine()); // 방향 전환 횟수 입력
		
		for(int i =0; i < k; i++) { // 뱀의 방향전환 정보
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(br.readLine()); // 뱀이 이동하는데 걸리는 시간
			char c = br.readLine().charAt(0); // 방향
		}
		
		//풀이
		//뱀의 이동경로를 저장할 데이터 구조가 필요함
		//Deque나 Queue 쓰면 될 듯
		// Queue front(뱀의 꼬리) {뱀 위치(0,1), (0,2) ....} rear(뱀의 머리)
//		Deque<p> snake = new ArrayDeque<>();
		//뱀의 머리(p)랑 몸통(큐)을 따로 뺴야 할듯,,
		// 
		Queue<p> snake = new LinkedList<>();
		snake.add(new p(1,1));
		char[]direction  = {'R', 'B', 'L', 'T'}; // 뱀의 머리 방향(R:오른쪽, L:왼쪽, T:위, B:아래)
		
		
		
		
		
		
	}

}
