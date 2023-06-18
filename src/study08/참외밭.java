package study08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class side{
	int direction;
	int length;
	
	public side(int direction, int length) {
		this.direction = direction;
		this.length = length;
	}
	
}

public class 참외밭 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); //1m^2당 참외가 자라는 수
		
		side[] sides = new side[6];
		StringTokenizer st;
		int maxWidth = 0;
		int maxHeight = 0;
		int maxWidth_idx = 0;
		int maxHeight_idx = 0;
		for(int i = 0; i < 6; i++) {
			st = new StringTokenizer(br.readLine());
			int d = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			sides[i] = new side(d, v);
			
			switch(d){
				case 1, 2: //동쪽, 서쪽(가로)
					if(maxWidth < v) {
						maxWidth = v;
						maxWidth_idx = i;
					}
					break;
				case 3, 4: //북쪽, 남쪽(세로)
					if(maxHeight < v) {
						maxHeight = v;
						maxHeight_idx = i;
					}
					break;
			}
		}
		// d4 -d2 - d3 - d1 - d3 - d1
		int max_size = maxWidth * maxHeight;
		int minWidth = sides[(maxWidth_idx + 3 > sides.length) ? (maxWidth_idx + 3) - sides.length : maxWidth_idx + 3].length;
		int minHeight = sides[(maxHeight_idx + 3 > sides.length) ? (maxHeight_idx + 3) - sides.length : maxHeight_idx + 3].length;
		
		System.out.println((max_size - (minWidth * minHeight)) * n);
		
	}

}
