package com.home.algorithm;

import java.io.*;

public class BinarySearch {
	public static void main(String[] args) throws IOException{
		int nums[] = {1, 2, 4, 5, 8, 10, 40, 99};
		System.out.println(binarySearch(nums, 40));
	}
	public static int binarySearch(int nums[], int target) {
		int left = 0;
		int right = nums.length-1;
		
		while (left <= right) {
			int pivot = (left+right)/2;
			int value = nums[pivot];
			if (value == target) 
				return pivot;
			else if (value < target)
				left = pivot+1;
			else // value > target
				right = pivot-1;
		}
		return -1;
	}
}