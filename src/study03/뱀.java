package study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

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
			snake.add(new p(tmp.getRow() + x, tmp.getCol()));
			while(templen >= tmp.getRow()) {
				snake.remove();
				templen -= tmp.getRow();
				
			}
			time += x;
			break;
		case 1: // B
		
			break;
		case 2: // L
		
			break;
		case 3: // T
			
			break;
		}
		
		// 뱀이 벽이나 자기자신의 몸에 부딪히는지 검사 
		
		
		// 이동 후 뱀의 머리 방향 전환
		if(c == 'D') {
			
		}else if(c =='L') {
			
		}
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); // 보드 크기 입력 n * n
		int k = Integer.parseInt(br.readLine()); // 사과의 개수 입력
		
		p[] apple = new p[k];
		for(int i =0; i < k; i++) { // 사과의 위치 입력
			int row = Integer.parseInt(br.readLine()); //행
			int col = Integer.parseInt(br.readLine()); //열
			
			apple[i] = new p(row, col);
		}
		
		int l = Integer.parseInt(br.readLine()); // 방향 전환 횟수 입력
		for(int i =0; i < k; i++) { // 뱀의 방향전환 정보
			int x = Integer.parseInt(br.readLine()); // 뱀이 이동하는데 걸리는 시간
			char c = br.readLine().charAt(0); // 방향
		}
		
		//풀이
		//뱀의 이동경로를 저장할 데이터 구조가 필요함
		//입출력이 자유로운 Deque를 사용하고 좌표를 저장할 객체를 받아 넣을거임.
		//Deque 말고 연결리스트로 큐를 만들어서 쓰는게 더 간단해 보임,,,ㅋㅋ
//		Deque<p> snake = new ArrayDeque<>();
		Queue<p> snake = new LinkedList<>();
		snake.add(new p(1,1));
		char[]direction  = {'R', 'B', 'L', 'T'}; // 뱀의 머리 방향(R:오른쪽, L:왼쪽, T:위, B:아래)
		
		
		
		
		
		
	}

}
