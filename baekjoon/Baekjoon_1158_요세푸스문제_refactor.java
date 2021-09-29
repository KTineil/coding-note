package algorithm;

import java.io.*;
import java.util.ArrayList;

public class Baekjoon_1158_요세푸스문제_refactor {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input[] = br.readLine().split(" ");
		int N = Integer.valueOf(input[0]);
		int K = Integer.valueOf(input[1]);
		ArrayList<Integer> al = new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		for (int i = 1; i <= N; i++) {
			al.add(i);
		}
		int idx = 0;
		while (true) {
			idx = (idx+K-1)%N;
			sb.append(al.get(idx));
			al.remove(idx);
			if (N != 1) {
				sb.append(", ");
			} else {
				sb.append(">");
				break;
			}
			N--;
		}
		
		bw.write(sb.toString());
		bw.close();
		br.close();
	}
}