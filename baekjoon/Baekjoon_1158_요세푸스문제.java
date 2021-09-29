package algorithm;

import java.io.*;
import java.util.LinkedList;

public class Baekjoon_1158_요세푸스문제 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input[] = br.readLine().split(" ");
		int N = Integer.valueOf(input[0]);
		int K = Integer.valueOf(input[1]);
		LinkedList<Integer> ll = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		for (int i = 1; i <= N; i++) {
			ll.add(i);
		}
		int cnt = 0;
		while (true) {
			if (ll.size() != 0) {
				for (int i = 0; i < ll.size(); i++) {
					cnt++;
					if (ll.size() == 1) {
						sb.append(ll.get(0)).append(">");
						ll.remove(0);
					} else if (cnt == K) {
						sb.append(ll.get(i)).append(", ");
						ll.remove(i--);
						cnt = 0;
					}
				}
			} else
				break;
		}
		
		bw.write(sb.toString());
		bw.close();
		br.close();
	}
}