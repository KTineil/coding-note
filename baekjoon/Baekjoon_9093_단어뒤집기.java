package algorithm;

import java.io.*;
import java.util.Stack;

public class Baekjoon_9093_단어뒤집기 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.valueOf(br.readLine());
		for (int i = 0; i < T; i++) {
			String input = br.readLine();
			int size = input.length();
			Stack<Character> stack = new Stack<Character>();
			char newWord[] = new char[size];
			int idx = 0;
			for (int j = 0; j < size; j++) {
				char c = input.charAt(j);
				if (c == ' ') {
					for (; idx < idx+stack.size(); idx++) {
						newWord[idx] = stack.pop();
					}
					newWord[idx++] = ' ';
				} else {
					stack.push(c);
				}
			}
			for (; idx < idx+stack.size(); idx++) {
				newWord[idx] = stack.pop();
			}
			bw.write(new String(newWord));
			bw.newLine();
		}
		
		bw.close();
		br.close();
	}
}