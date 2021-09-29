package algorithm;

import java.io.*;

public class Baekjoon_10828_Ω∫≈√ {
	static int top = 0;
	static int stack[];
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int testCase = Integer.valueOf(br.readLine());
    	stack = new int[testCase];
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < testCase; i++) {
			String input[] = br.readLine().split(" ");
			String flag = input[0];
			switch (flag) {
			case "push":
				int data = Integer.valueOf(input[1]);
				push(data);
				break;
			case "pop":
				sb.append(pop());
				break;
			case "top":
				sb.append(seek());
				break;
			case "empty":
				if(isEmpty())
					sb.append("1");
				else
					sb.append("0");
				break;
			case "size":
				sb.append(top);
				break;
			}
			if (!flag.equals("push"))
				sb.append("\n");
    	}
    	System.out.println(sb.toString());
    }
    private static int seek() {
    	if (top == 0)
    		return -1;
		return stack[top-1];
	}
	static void push(int data) {
		stack[top++] = data;
    }
    static int pop() {
    	if (top == 0)
    		return -1;
    	int data = stack[--top];
    	return data;
    }
    static boolean isEmpty() {
    	if (top == 0)
    		return true;
    	else
    		return false;
    }
}
