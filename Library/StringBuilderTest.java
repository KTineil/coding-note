package com.home.algorithm;

class StringBuilder {
	private char[] value;
	private int size;
	private int index;
	
	StringBuilder(String str) {
		size = str.length();
		value = new char[size];
		index = 0;
		this.append(str);
	}
	StringBuilder() {
		size = 1;
		value = new char[size];
		index = 0;
	}
	
	public void append(String str) {
		if (str == null) str = "null";
		int len = str.length();
		ensureCapacity(len);
		for (int i = 0; i < str.length(); i++) {
			value[index] = str.charAt(i);
			index++;
		}
	}

	private void ensureCapacity(int len) {
		if (size-index < len) {
			size = (size + len) * 2;
			char[] newValue = new char[size];
			for (int i = 0; i < value.length; i++) {
				newValue[i] = value[i];
			}
			value = newValue;
		}
	}
	
	public String toString() {
		return new String(value, 0, index);
	}
}

public class StringBuilderTest {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hi");
		sb.append(" Hello");
		sb.append(" nice to");
		sb.append(" meet you~");
		System.out.println(sb.toString());
	}
}
