package algorithm;

import java.io.*;

public class ProgrammersStrZip {
	public static void main(String[] args) throws IOException {
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String word = in.readLine();
		int size = word.length();
		int min = size;
		for (int i = 1; i <= size/2; i++) {
			int len = compression(word, i, size);
			min = Math.min(min, len);
		}
		out.write(min+"");
		out.close();
		in.close();
	}

	private static int compression(String word, int i, int size) throws IOException {
		String pattern = "";
		String compression = "";
		int cnt = 1;
		
		// ������ ���簪�� ���ϱ� ������ size + i���ؼ� ���̺��� �� �� �� ����ǰ� ��.
		for (int j = 0; j < size+i; j+=i) {
			String curStr;
			
			if (j >= size) {
				curStr = "";
			} else if (size <= j+i) {
				curStr = word.substring(j);
			} else {
				curStr = word.substring(j, j+i);
			}
			
			if (j != 0) {
				if (curStr.equals(pattern)) {
					cnt++;
				} else if (cnt > 1) {
					compression += cnt + pattern; 
					cnt = 1;
				} else {
					compression += pattern;
				}
			}
			pattern = curStr;
		}
		return compression.length();
	}
}
