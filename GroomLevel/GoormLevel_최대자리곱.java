package com.home.algorithm;

/*
 * (����) https://github.com/alledy/algorithm-practice/blob/master/goorm/solved/%EC%B5%9C%EB%8C%80%20%EC%9E%90%EB%A6%AC%EA%B3%B1/README.md
 * (����) https://level.goorm.io/exam/49113/%EC%B5%9C%EB%8C%80-%EC%9E%90%EB%A6%AC%EA%B3%B1/quiz/1
 * */
import java.io.*;
class GoormLevel_�ִ��ڸ��� {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		int len = n.length();
		int[] nums = new int[len];
		nums[0] = Integer.parseInt(n); // �ʱⰪ �迭�� �߰�
		for (int i = 0; i < len-1; i++) {
			// preNum
			int preNum_ = Integer.parseInt(n.substring(0, i+1)) - 1;
			String preNum = "";
			if (preNum_ != 0) 
				preNum = Integer.toString(preNum_);
			
			// postNum
			String postNum = "";
			for (int j = 0; j < len-(i+1); j++) {
				postNum += "9";
			}
			
			// �迭�� (preNum + postNum) �߰�
			nums[i+1] = Integer.parseInt(preNum + postNum);
		}
		
		int maxValue = 0;
		for (Integer num: nums) {
			int multi = 1;
			while (num >= 1) {
				multi *= num % 10;
				if (multi == 0)
					break;
				num /= 10;
			}
			if (maxValue < multi)
				maxValue = multi;
		}
		
		System.out.println(maxValue);
	}
}