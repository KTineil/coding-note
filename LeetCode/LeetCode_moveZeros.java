package com.home.algorithm;

import java.io.*;

public class BitCode_moveZeros {
	public static void main(String[] args) throws IOException{
		int nums[] = {0, 0, 0, 0, 0, 0, 0, 0, 1};
		moveZeros(nums);
		for (int i : nums) {
			System.out.print(i+" ");
		}
	}

	private static void moveZeros(int[] nums) {
		int wIdx = 0;
		int idx = 0;
		while (idx < nums.length) {
			if (nums[idx] != 0) {
				// swqp
				int tmp = nums[wIdx];
				nums[wIdx] = nums[idx];
				nums[idx] = tmp;
				idx++;
				wIdx++;
			} else { // nums[idx] == 0
				idx++; 
			}
		}
	}
	
}