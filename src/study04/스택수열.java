package study04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 스택수열 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> st = new Stack<>();
		int[] k = new int[n];
		for(int i = 0; i < k.length; i++) {
			k[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i : k) {
			
		}

	}

}
