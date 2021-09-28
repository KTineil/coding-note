package com.home.algorithm;

import java.io.*;

public class BitCode_209_MinimunSizeSubarraySum {
	public static void main(String[] args) throws IOException{
		int nums[] = {2, 4, 1, 2, 3, 4, 1};
		
		System.out.println(subArraySum(nums));
	}

	private static int subArraySum(int[] nums) {
		int minimum = nums.length;
		int sum = 0;
		int startIdx = 0;
		int endIdx = 0;
		while (endIdx < nums.length) {
			sum += nums[endIdx];
			
			if (sum == 7) {
				if (minimum > endIdx-startIdx+1) minimum = endIdx-startIdx+1;
				sum -= nums[startIdx++] + nums[endIdx];
			}
			else if (sum > 7) {
				sum -= nums[startIdx++] + nums[endIdx];
			} else {
				endIdx++;
			}
		}
		return minimum;
	}
}