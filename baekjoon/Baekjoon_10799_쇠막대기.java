package algorithm;

import java.io.*;

public class Baekjoon_10799_�踷��� {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int newSteel = 0;
		int oldSteel = 0;
		
		char input[] = br.readLine().toCharArray();
		int cnt = 0;
		
		for (int i = 0; i < input.length; i++) {
			char c = input[i];
			
			if (c == ')') {
				if (input[i-1] == '(') {
					newSteel--;
					cnt += newSteel*2 + oldSteel;
					oldSteel += newSteel;
					newSteel = 0;
				} else {
					oldSteel--;
				}
			} else {
				newSteel++;
			}
		}
		
//		while (r < input.length()-1) {
//			char cur = input.charAt(r);
//			if (input.substring(r, r+2).equals("()")) {
//				// newOne �����ŭ ¥����
//				cnt += newSteel*2;
//				// oldOne ������ ��ŭ ¥����
//				cnt += oldSteel;
//				// newOne�� �ִ��ֵ� oldOne���� �̼�
//				oldSteel += newSteel;
//				newSteel = 0;
//				r += 2;
//				continue;
//			} else if (cur == '(') {
//				newSteel++;
//			} else {
//				oldSteel--;
//			}
//			r++;
//		}
//		
		bw.write(Integer.toString(cnt));
		bw.close();
		br.close();
	}
}