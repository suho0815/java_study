package backjoon.level03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class level03_06 {
	public static void main(String[] args) throws IOException {
		//본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다. 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점
		//Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다. BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
		
		//readLine()은 입력값으로 들어온 데이터를 한 줄로 읽어서 String으로 바꾸는 메소드

		BufferedReader bufferin = new BufferedReader(new InputStreamReader(System.in)); //입력버퍼 선언
		BufferedWriter bufferout = new BufferedWriter(new OutputStreamWriter(System.out)); 
		
//		String s = bufferio.readLine();
		int t = Integer.parseInt(bufferin.readLine());
		StringTokenizer s; // 공백마다 문자열을 분리하기 위한 객체
		for(int i = 0; i < t;i++) {
			s = new StringTokenizer(bufferin.readLine());
			bufferout.write(Integer.parseInt(s.nextToken()) + Integer.parseInt(s.nextToken()) +"\n");
		}
		bufferout.close();
		
	}
}
