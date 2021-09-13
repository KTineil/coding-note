package com.home.algorithm;
import java.io.*;
public class Baekjoon_10250_ACMHotel {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			String[] input = br.readLine().split(" ");
			int h = Integer.valueOf(input[0]);
			int w = Integer.valueOf(input[1]);
			int room = Integer.valueOf(input[2]);
			
			int floor = room % h;
			int roomNumber;
			if (floor != 0) {
				roomNumber = room / h + 1;
			} else {
				roomNumber = room / h;
				floor = h;
			}
			bw.write(String.format("%d%02d\n", floor, roomNumber));
		}
		
		bw.close();
		br.close();
	}
}