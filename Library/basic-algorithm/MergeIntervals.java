package com.home.algorithm;

public class MergeIntervals {
	public static void main(String[] args) {
		int[][] arr = new int[4][2];
		arr[0] = new int[] {1, 5};
		arr[1] = new int[] {3, 7};
		arr[2] = new int[] {10, 15};
		arr[3] = new int[] {8, 16};
		
		quickSort(arr, 0, arr.length-1);
		
		int start = arr[0][0];
		int end = arr[0][1];
		for (int[] is : arr) {
			if (is[0] > end) {
				System.out.printf("[%d, %d]", start, end);
				start = is[0];
				end = is[1];
			} else {
				end = is[1];
			}
		}
		System.out.printf("[%d, %d]", start, end);
	}
	
	static void quickSort(int[][] nums, int low, int high) {
		if (low >= high)
			return;
		
		int pivot = partitioning(nums, low, high);
		
		quickSort(nums, low, pivot-1);
		quickSort(nums, pivot+1, high);
	}

	static int partitioning(int[][] nums, int left, int right) {
		int low = left;
		int high = right;
		int pivot = nums[left][0];
		
		while (low < high) {
			while (nums[high][0] > pivot && low < high)
				high--;
			while (nums[low][0] <= pivot && low < high)
				low++;
			swap(nums, low, high);
		}
		swap(nums, left, low);
		
		return low;
	}

	private static void swap(int[][] nums, int a, int b) {
		int[] tmp = nums[a];
		nums[a] = nums[b];
		nums[b] = tmp;
	}
}