package com.home.algorithm;

import java.io.*;

public class SortColor {
	public static void main(String[] args) throws IOException{
		int nums[] = {1, 0, 1, 2, 1, 2, 0, 0, 2};
		
		int index2 = nums.length-1;
		int index0 = 0;
		int i = 0;
		while (i <= index2) {
			if (nums[i] == 0) {
				swap(nums, index0, i);
				index0++;
				i++;
			} else if (nums[i] == 2) {
				swap(nums, index2, i);
				index2--;
			} else
				i++;
		}
		
		for (int num : nums) {
			System.out.print(num+" ");
		}
	}

	private static void swap(int[] nums, int index0, int i) {
		int tmp = nums[index0];
		nums[index0] = nums[i];
		nums[i] = tmp;
	}
}