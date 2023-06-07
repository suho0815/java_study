package study05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 문자열폭발 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuffer strbuf = new StringBuffer();
		strbuf.append(br.readLine());
		String boom = br.readLine();
		
		br.close();
		
//		long beforeTime = System.currentTimeMillis();
		
		int in = strbuf.indexOf(boom);
		
		while(in >= 0) {
			strbuf.replace(in, in + boom.length(), "");
			in = strbuf.indexOf(boom);
		}
		
		if(strbuf.length() == 0) {
			System.out.println("FRULA");
		}else {
			System.out.println(strbuf);
		}
		
		
//		long afterTime = System.currentTimeMillis(); 
//		long secDiffTime = (afterTime - beforeTime)/1000;
//		System.out.println("시간차이(m) : "+secDiffTime);
	}

}
