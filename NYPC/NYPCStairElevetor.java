package algorithm;

import java.io.*;

public class NYPCStairElevetor {
	public static void main(String[] args) throws IOException {
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String input[] = in.readLine().split(" ");
		long m = Long.valueOf(input[0]);
		long f = Long.valueOf(input[1]);
		long n = Long.valueOf(input[2]);
		
		n -= m-f;
		int result = 0;
		long val = n / (m-1);
		result += val;
		long mod = n % (m-1);

		if (mod >= f)
			result += 2;
		else if (!(mod == 0 && m == f))
			result += 1;
		
		out.write(Long.toString(result));
		out.close();
		in.close();
	}
}
