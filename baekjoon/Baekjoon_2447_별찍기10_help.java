package algorithm;

/*
 * (µµ¿ò) https://st-lab.tistory.com/95
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

public class Baekjoon_2447_º°Âï±â10_help {
	static String star[][];
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.valueOf(br.readLine());
        star = new String[N][N];
        StringBuilder sb = new StringBuilder();
        makeStar(N);
        for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append(star[i][j]);
			}
			sb.append("\n");
		}
        System.out.println(sb);
        bw.close();
        br.close();
    }

	private static void makeStar(int n) {
		int size = n/3;
		int cnt = 0;
		for (int i = 0; i < n; i+=size) {
			for (int j = 0; j < n; j+=size) {
				cnt++;
				if (cnt == 5)
					makeStar(i, j, size, true);
				else
					makeStar(i, j, size, false);
			}
		}
	}

	private static void makeStar(int x, int y, int n, boolean blank) {
		if (blank) {
			for (int i = x; i < x+n; i++) {
				for (int j = y; j < y+n; j++) {
					star[i][j] = " "; 
				}
			}
			return;
		}
		if (n == 1) {
			star[x][y] = "*";
			return;
		}
		
		int size = n/3;
		int cnt = 0;
		for (int i = x; i < x+n; i+=size) {
			for (int j = y; j < y+n; j+=size) {
				cnt++;
				if (cnt == 5)
					makeStar(i, j, size, true);
				else
					makeStar(i, j, size, false);
			}
		}
	}
}
