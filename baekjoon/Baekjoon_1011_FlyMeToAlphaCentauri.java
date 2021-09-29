package algorithm;

import java.io.*;

public class Baekjoon_1011_FlyMeToAlphaCentauri {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCase = Integer.valueOf(br.readLine());
		for (int i = 0; i < testCase; i++) {
			String input[] = br.readLine().split(" ");
			long x = Long.valueOf(input[0]);
			long y = Long.valueOf(input[1]);
			long distance = y-x;
			long sumDis = 0;
			int maxValue = 1;
			int cnt = 0;
			while (distance > sumDis) {
				cnt++;
				if (cnt == 3) {
					cnt = 1;
					maxValue++;
				}
				sumDis += maxValue;
			}

			int result = cnt == 1? maxValue*2-1: maxValue*2;
			bw.write(Integer.toString(result));
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}