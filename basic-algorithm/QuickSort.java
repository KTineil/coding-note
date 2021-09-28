package com.home.algorithm;

import java.io.*;

public class QuickSort {
	public static void main(String[] args) throws IOException{
		int nums[] = {1,2,3,3,4,9,4};
		
		l_pivot_sort(nums, 0, nums.length-1);
		
		for (int i : nums) {
			System.out.print(i+" ");
		}
	}
	
	private static void l_pivot_sort(int[] nums, int low, int high) {
		if (low >= high)
			return;
		
		int pivot = partition(nums, low, high);
		
		l_pivot_sort(nums, low, pivot-1);
		l_pivot_sort(nums, pivot+1, high);
	}
	
	private static int partition(int[] nums, int left, int right) {
		int low = left;
		int high = right;
		int pivot = nums[left];
		
		while (low < high) {
			while (nums[high] > pivot && low < high) {
				high--;
			}
			while (nums[low] <= pivot && low < high) {
				low++;
			}
			swap(nums, low, high);
		}
		swap(nums, left, low);
		
		return low;
	}

	private static void swap(int[] nums, int a, int b) {
		int tmp = nums[a];
		nums[a] = nums[b];
		nums[b] = tmp;
	}
}