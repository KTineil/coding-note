package algorithm;

import java.io.*;

public class Baekjoon_1193_분수찾기 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int x = Integer.valueOf(br.readLine());
		int stored = 0;
		int cnt = 0;
		while (x > stored) {
			cnt++;
			stored += cnt;
		}
		if (cnt%2 == 0) {
			bw.write(String.format("%d/%d", cnt-stored+x,stored-x+1));
		}
		else {
			bw.write(String.format("%d/%d", stored-x+1, cnt-stored+x));
		}
		
		br.close();
		bw.close();
	}
}
