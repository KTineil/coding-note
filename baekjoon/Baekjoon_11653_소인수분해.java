package algorithm;

import java.io.*;

public class Baekjoon_11653_소인수분해 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		for (int i = 2; i <= Math.sqrt(n); i++) {
			while (n%i == 0) {
				sb.append(i).append("\n");
				n /= i;
			}
		}
		if (n != 1)
			sb.append(n);
		
		System.out.println(sb);
		br.close();
		bw.close();
	}
}
