/*
 * 1 2 3
 * 8 9 4
 * 7 6 5
 * 
 * -> 위 배열과 같이 달팽이 껍질처럼 할당된 배열을 구현하는 문제
 * */

package algorithm;

import java.io.*;

public class SnailArray {
	public static void main(String[] args) throws IOException {
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(in.readLine());
		int board[][] = new int[num][num];
		boolean status[][] = new boolean[num][num];

		int xDir[] = { 0, 1, 0, -1 };
		int yDir[] = { 1, 0, -1, 0 };
		int x = 0;
		int y = 0;
		int dir = 0;
		for (int i = 1; i <= num * num; i++) {
			board[x][y] = i;
			status[x][y] = true;
			int nx = x + xDir[dir];
			int ny = y + yDir[dir];
			
			if (nx >= num || nx < 0 || ny >= num || ny < 0 || status[nx][ny]) {
				dir++;
				if (dir == 4)
					dir = 0;
				nx = x + xDir[dir];
				ny = y + yDir[dir];
			}
			x = nx;
			y = ny;
		}

		for (int i[] : board) {
			for (int j : i) {
				out.write(Integer.toString(j) + "\t");
			}
			out.newLine();
		}

		out.close();
		in.close();
	}
}
