package algorithm;

import java.io.*;

/*
 * ���ڿ� S�� �Է¹��� �Ŀ�, �� ���ڸ� R�� �ݺ��� �� ���ڿ� P�� ���� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��, 
 * ù ��° ���ڸ� R�� �ݺ��ϰ�, �� ��° ���ڸ� R�� �ݺ��ϴ� ������ P�� ����� �ȴ�. S���� QR Code "alphanumeric" ���ڸ� ����ִ�.
 * QR Code "alphanumeric" ���ڴ� 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: �̴�.
 *
 * �Է�
 * ù° �ٿ� �׽�Ʈ ���̽��� ���� T(1 �� T �� 1,000)�� �־�����. �� �׽�Ʈ ���̽��� �ݺ� Ƚ�� R(1 �� R �� 8), 
 * ���ڿ� S�� �������� ���еǾ� �־�����. S�� ���̴� ��� 1�̸�, 20���ڸ� ���� �ʴ´�. 
 * */

public class Baekjoon_2675_RepeatString {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.valueOf(br.readLine());
		for (int i = 0; i < t; i++) {
			String[] tmp = br.readLine().split(" ");
			int n = Integer.valueOf(tmp[0]);
			String word = tmp[1];
			String new_word = "";
			for (int j = 0; j < word.length(); j++) {
				String cur = word.substring(j, j+1);
				for (int k = 0; k < n; k++) {
					new_word += cur;
				}
			}
			bw.write(new_word+"\n");
		}
		
		br.close();
		bw.close();
	}
//	public static String solution(String new_id) {
//		
//	}
}
