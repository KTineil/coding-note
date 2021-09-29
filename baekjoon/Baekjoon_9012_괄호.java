package algorithm;

import java.io.*;

public class Baekjoon_9012_°ýÈ£ {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.valueOf(br.readLine());
		for (int i = 0; i < T; i++) {
			int cnt = 0;
			char parenthesis[] = br.readLine().toCharArray();
			if (parenthesis[0] == ')')
				bw.write("NO\n");
			else {
					for (int j = 0; j < parenthesis.length; j++) {
					if (parenthesis[j] == '(') cnt++;
					else {
						if (cnt == 0) {
							cnt = -1;
							break;
						} else {
							cnt--;
						}
					}
				}
				if (cnt > 0) {
					bw.write("NO\n");
				}
				else
					if (cnt == -1) {
						bw.write("NO\n");
					} else
						bw.write("YES\n");
			}
		}
		
		bw.close();
		br.close();
	}
}