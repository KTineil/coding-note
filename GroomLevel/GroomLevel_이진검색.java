package com.home.algorithm;
import java.io.*;
public class GroomLevel_이진검색 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] data_ = br.readLine().split(" ");
		int[] data = new int[n];
		for (int i = 0; i < data.length; i++) {
			data[i] = Integer.parseInt(data_[i]);
		}
		data_ = null;
		int value = Integer.valueOf(br.readLine());
		int low = 0;
		int high = n-1;
		int mid = n / 2;
		while (data[mid] != value) {
			if (high <= low) {
				mid = -1;
				break;
			}
			if (data[mid] > value)
				high = mid-1;
			else
				low = mid+1;
			
			mid = (high+low) / 2;
		}

		if (mid == -1)
			System.out.println("X");
		else
			System.out.println(mid+1);
	}
}