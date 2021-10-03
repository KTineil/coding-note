package com.home.algorithm;

public class ShortestUnsortedContiuousSubarray {
	public static void main(String[] args) {
		int[] arr = new int[] {2, 4, 6};
		int size = arr.length;
		int min = 1000;
		int max = 0;
		for (int i = 0; i < size-1; i++) {
			if (arr[i+1] < arr[i])
				min = Math.min(min, arr[i+1]);
			if (arr[size-i-1] > arr[size-i-2])
				max = Math.max(max, arr[size-i-2]);
		}
		
		int start = 0;
		int end = size-1;
		
		if (min == 1000) {
			min = 0;
			max = 1000;
		}
		
		for (int i = 0; i < size; i++) {
			if (arr[start] <= min)
				start++;
			if (arr[end] >= max)
				end--;
		}
		
		System.out.printf("%d %d", start, end);
	}
}