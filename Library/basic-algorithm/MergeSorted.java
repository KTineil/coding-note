package com.home.algorithm;

public class MergeSorted {
	public static void main(String[] args) {
		int nums1[] = {1, 3, 5, 0, 0, 0};
		int nums2[] = {2, 4, 7};
		mergeSorted(nums1, nums2);
		for (int i = 0; i < nums1.length; i++) {
			System.out.println(nums1[i]);
		}
	}
	
	static void mergeSorted(int nums1[], int nums2[]) {
		int idx1 = nums1.length-nums2.length-1;
		int idx2 = nums2.length-1;
		int idx3 = nums1.length-1;
		
		while (idx1 >= 0 && idx2 >= 0) {
			if (nums1[idx1] > nums2[idx2]) {
				nums1[idx3] = nums1[idx1];
				idx1--;
			} else {
				nums1[idx3] = nums2[idx2];
				idx2--;
			}
			idx3--;
		}
		
		if (idx2 >= 0) {
			for (int i = 0; i <= idx2; i++) {
				nums1[i] = nums2[i];
			}
		}
	}
}