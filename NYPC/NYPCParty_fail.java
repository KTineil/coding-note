package algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class NYPCParty {
	public static void main(String[] args) throws IOException {
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		StringTokenizer token = new StringTokenizer(in.readLine());
		int data[] = new int[n];
		int sum = 0;
		int avg = 0;
		int i = 0;
		while (token.hasMoreTokens()) {
			int money = Integer.parseInt(token.nextToken());
			sum += money;
			data[i++] = money;
		}
		avg = sum / n;
		int result = 0;
		for (int j = 0; j < n; j++) {
			if (data[j] < avg)
				result += avg - data[j];
		}
		
		out.write(Integer.toString(result));
		out.close();
		in.close();
	}
}
