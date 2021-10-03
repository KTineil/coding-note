package com.home.algorithm;

public class FindDuplicate {
	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3, 4 ,2};
		int[] nums2 = new int[] {5, 4, 3, 2, 1, 3};
		System.out.println(findDuplicateTwoPointer(nums2));
		System.out.println(findDuplicateUseSort(nums2));
		System.out.println(findDuplicateUseArray(nums2));
		System.out.println(findDuplicateUseBinary(nums2));
		System.out.println(findDuplicateUseIdx(nums2));
	}
	
	static int findDuplicateTwoPointer(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i] == nums[j]) 
					return nums[i];
			}
		}
		return -1;
	}
	
	static int findDuplicateUseSort(int[] nums) {
		QuickSort.quickSort(nums);
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i] == nums[i+1])
				return nums[i];
		}
		return -1;
	}
	
	static int findDuplicateUseArray(int[] nums) {
		boolean[] arr = new boolean[nums.length+1];
		
		for (int i = 0; i < nums.length; i++) {
			if (arr[nums[i]])
				return nums[i];
			else
				arr[nums[i]] = true;
		}
		return -1;
	}
	
	static int findDuplicateUseBinary(int[] nums) {
		int binary = 0;
		for (int i = 0; i < nums.length; i++) {
			if ((binary & (1 << nums[i])) > 0)
				return nums[i];
			else
				binary |= (1 << nums[i]);
		}
		return -1;
	}
	
	static int findDuplicateUseIdx(int[] nums) {
		
		for (int i = 0; i < nums.length; i++) {
			int idx = nums[i] < 0 ? nums[i]*-1: nums[i];
			if (nums[idx] < 0)
				return idx;
			else
				nums[idx] *= -1;
		}
		
		return -1;
	}
}