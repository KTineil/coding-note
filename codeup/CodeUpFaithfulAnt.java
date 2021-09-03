package algorithm;

import java.io.*;

public class CodeUpFaithfulAnt {
	public static void main(String[] args) throws IOException {
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String board[][] = new String[10][10];
		for (int i = 0; i < 10; i++) {
			board[i] = in.readLine().split(" ");
		}
		int x = 1;
		int y = 1;
		while (!board[x][y].equals("2")) {
			int nx = x;
			int ny = y;
			
			if (!board[x][y+1].equals("1"))
				ny++;
			else if (!board[x+1][y].equals("1"))
				nx++;
			else
				break;
			
			board[x][y] = "9";
			x = nx;
			y = ny;
		}
		board[x][y] = "9";
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				out.write(board[i][j]);
				out.write(" ");
			}
			out.newLine();
		}
		out.close();
		in.close();
	}
}
