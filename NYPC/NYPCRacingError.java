package algorithm;

import java.io.*;

public class NYPCRacingError {
	public static void main(String[] args) throws IOException {
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String[] data = in.readLine().split(" ");
		int n = Integer.parseInt(data[0]);
		int m = Integer.parseInt(data[1]);
		boolean isError = false;
		int[] startTime = new int[n+1];
		int[] endTime = new int[n+1];
		boolean status[] = new boolean[n+1];
		for (int i = 0; i < m; i++) {
			String[] log = in.readLine().split(" ");
			int id = Integer.parseInt(log[1]);
			int flag = Integer.parseInt(log[2]);
			if (flag == 0) {
				startTime[id] = Integer.parseInt(log[0]);
				// 종료 여부 에러검사
				if (status[id]) {
					isError = true;
					break;
				}
				status[id] = true;
			} else {
				endTime[id] = Integer.parseInt(log[0]);
				if (!status[id]) {
					isError = true;
					break;
				} else if (endTime[id] - startTime[id] < 60) {
					isError = true;
					break;
				}
				status[id] = false;
			}
		}

		for (boolean b : status) {
			if (b) {
				isError = true;
				break;
			}
		}
		
		String result = isError ? "NO" : "YES";
		out.write(result);
		out.close();
		in.close();
	}
}
