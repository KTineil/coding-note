package algorithm;

import java.io.*;

public class Baekjoon_2869_달팽이는올라가고싶다 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input[] = br.readLine().split(" ");
		int A = Integer.valueOf(input[0]);
		int B = Integer.valueOf(input[1]);
		int V = Integer.valueOf(input[2]);
		
		V -= B;
		int answer = V/(A-B);
		int mod = V%(A-B);
		if (mod != 0)
			answer++;
		bw.write(Integer.toString(answer));
		br.close();
		bw.close();
	}
}
