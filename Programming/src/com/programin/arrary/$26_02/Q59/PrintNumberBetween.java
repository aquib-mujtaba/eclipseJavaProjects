package com.programin.arrary.$26_02.Q59;

public class PrintNumberBetween {

	public static void main(String[] args) {
		String st = "2..8,23..48,56..59 ";
		char ch[] = st.toCharArray();
		int sum = 0, s = 0, l = 0;
		for (int i = 0; i < ch.length; i++) {
			int no = 0;
			while (i < ch.length && ch[i] >= '0' && ch[i] <= '9') {

				no = no * 10 + (ch[i] - 48);
				i++;
			}
			sum = sum + no;
			if (ch[i] == '.') {
				s = sum;
				break;
			}
			if (ch[i] == ',') {
				l = sum;
			}
		}
		System.out.println("==s=" + s);
		System.out.println("==s=" + l);
		// for (int i = 0; i < ch.length; i++) {
		// int s = 0, l = 0;
		// if (ch[i] == '.' && ch[i - 1] == '.') {
		// s = (ch[i - 2] - 48);
		// l = (ch[i + 1] - 48);
		// System.out.println(s);
		// System.out.println(l);
		// for (int j = s; j < l - 1; j++) {
		// s++;
		// System.out.println("==>" + s);
		// }
		// }
		// }
	}
}
