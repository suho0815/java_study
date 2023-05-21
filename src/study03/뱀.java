package study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        p user = (p) obj;
        return row == user.row && col == user.col;
	}

	
	
}

class xc {
	int x;
	char c;
	public xc(int x, char c) {
		this.x = x;
		this.c = c;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public char getC() {
		return c;
	}
	public void setC(char c) {
		this.c = c;
	}
	
}

public class 뱀 {

	static int snakeLen = 1; //뱀의 몸 길이 
	static int snakeHead = 0; //현재 뱀의 머리 방향
	static int time = 0; //시간
	static int n = 0;
	static ArrayList<p> apple = new ArrayList<p>();
	static ArrayList<xc> xc = new ArrayList<xc>();
	
	//static HashMap<Integer, Character> move = new HashMap<>();
	
	public static boolean eatApple(Queue<p> snake, p head1) {
		
		 // 사과 묵었는지 검사
			for (p a : apple) {
//				System.out.println(a.getRow());
//				System.out.println(head1.getRow());
//				System.out.println(a.getRow() == head1.getRow());
				if (a.getRow() == head1.getRow() && a.getCol() == head1.getCol()) {
					apple.remove(a);
					return true;
				}
			}

		return false;
	}
	
	public static boolean isFinish(Queue<p> snake, p head1) {
		//벽에 부딪히는지 검사
		if(head1.getRow() <= 0 || head1.getCol() <= 0 || head1.getRow() > n || head1.getCol() > n ) {
			return true;
		}
		
		for(int j = 0; j < snake.size(); j++) { // 자기 자신의 몸에 부딪히는지 검사
			p temp = snake.poll();
			if(temp.equals(head1)) {
				return true;
			}
			snake.add(temp);
		}
		
		return false;
	}
	
	public static void snakeMove(Queue<p> snake) { //snakeMove(뱀, 시간, 뱀의 머리를 전환할 방향, 뱀의 머리 위치, 보드 크기)
		// 뱀의 머리 방향으로 x만큼 이동
		p head = new p(1, 1);
		snake.add(head);
		//게임 시작
		while(true) {
			
			switch (snakeHead) {
			case 0: // R
				head = new p(head.getRow(), head.getCol() + 1);
				time++;
				if (isFinish(snake, head)) {
					return;
				}
				
				if (eatApple(snake, head)) {
					snake.add(head);
				}else {
					snake.add(head);
					snake.remove();
				}
				break;
				case 1: // B

					head = new p(head.getRow() + 1, head.getCol());
					time++;

					if (isFinish(snake, head)) {
						return;
					}
					if (eatApple(snake, head)) {
						snake.add(head);
					}else {
						snake.add(head);
						snake.remove();
					}

					break;
				case 2: // L

					head = new p(head.getRow(), head.getCol() - 1);
					time++;

					if (isFinish(snake, head)) {
						return;
					}
					if (eatApple(snake, head)) {
						snake.add(head);
					}else {
						snake.add(head);
						snake.remove();
					}

					break;
				case 3: // T

					head = new p(head.getRow() - 1, head.getCol());
					time++;

					if (isFinish(snake, head)) {
						return;
					}
					if (eatApple(snake, head)) {
						snake.add(head);
					}else {
						snake.add(head);
						snake.remove();
					}
					break;
				}
				// 이동 후 뱀의 머리 방향 전환
			for(xc x : xc) {
				if (x.getX() == time) {
					if (x.getC() == 'D') {
						snakeHead++;
						if (snakeHead >= 4) {
							snakeHead = 0;
						}
					} else if (x.getC() == 'L') {
						snakeHead--;
						if (snakeHead < 0) {
							snakeHead = 3;
						}
					}
				}
			}
			
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken()); // 보드 크기 입력 n * n
		
		st = new StringTokenizer(br.readLine(), " ");
		int k = Integer.parseInt(st.nextToken()); // 사과의 개수 입력
		
		
//		p[] apple = new p[k];
		for(int i =0; i < k; i++) { // 사과의 위치 입력
			st = new StringTokenizer(br.readLine(), " ");
			int row = Integer.parseInt(st.nextToken()); //행
			int col = Integer.parseInt(st.nextToken()); //열
			
			apple.add(new p(row, col));
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		int l = Integer.parseInt(st.nextToken()); // 방향 전환 횟수 입력
		
		for(int i =0; i < l; i++) { // 뱀의 방향전환 정보
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken()); // 뱀이 이동하는데 걸리는 시간
			char c = st.nextToken().charAt(0); // 방향
			
			xc.add(new xc(x, c));
		}
		
		//풀이
		//뱀의 이동경로를 저장할 데이터 구조가 필요함
		//Deque나 Queue 쓰면 될 듯
		// Queue front(뱀의 꼬리) {뱀 위치(0,1), (0,2) ....} rear(뱀의 머리)
//		Deque<p> snake = new ArrayDeque<>();
		//뱀의 머리(p)랑 몸통(큐)을 따로 뺴야 할듯,,
		// 
		Queue<p> snake = new LinkedList<>();
		
		//char[]direction  = {'R', 'B', 'L', 'T'}; // 뱀의 머리 방향(R:오른쪽, L:왼쪽, T:위, B:아래)
		
		snakeMove(snake);
		System.out.println(time);
		
	}

}
