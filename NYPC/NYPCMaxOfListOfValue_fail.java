package algorithm;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class NYPCMaxOfListOfValue {
	public static void main(String[] args) throws IOException {
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력 처리
		int n = Integer.parseInt(in.readLine());
		String data_[] = in.readLine().split(" ");
		long data[] = new long[n];
		for (int i = 0; i < n; i++) {
			data[i] = Long.valueOf(data_[i]);
		}
		
		List<Long> sums = new ArrayList<Long>();
		for (int i = 0; i < data.length; i++) {
			long tmp = 0L;
			for (int j = i; j < data.length; j++) {
				tmp += data[j];
				sums.add(tmp);
			}
		}
		long max = sums.get(0);
		for (Long sum : sums) {
			if (sum > max)
				max = sum;
		}
		
		out.write(Long.toString(max));
		out.close();
		in.close();
	}
}
