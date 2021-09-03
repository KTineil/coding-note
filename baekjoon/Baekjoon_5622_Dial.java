package algorithm;

import java.io.*;

public class Baekjoon_5622_Dial {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String data = br.readLine();
		int result = 0;
		for (int i = 0; i < data.length(); i++) {
			char ascii_ = data.charAt(i);
			int ascii = (int)ascii_-64;
			int num;
			
			if (ascii < 16) {
				if (ascii%3 == 0)
					num = ascii / 3 + 1;
				else
					num = ascii / 3 + 2;
			} else {
				if (ascii >= 16 && ascii < 20)
					num = 7;
				else if (ascii >= 20 && ascii < 23)
					num = 8;
				else if (ascii >= 23 && ascii < 27)
					num = 9;
				else
					num = 0;
			}
			result += num+1;
		}
		bw.write(Integer.toString(result));
		br.close();
		bw.close();
	}
}
