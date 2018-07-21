package com.aquib.stack;

import java.util.Scanner;
import java.util.Stack;

public class StackExmaple {

	public static void main(String[] args) {
		System.out.println("enter your");
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		Stack stk = new Stack();
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (ch == '{' || ch == '[' || ch == '(') {
				stk.push(ch);
			} else {
				if (stk.isEmpty()) {
					System.out.println("Not Balanced");
					return;
				}
				char c = (char) stk.pop();
				switch (c) {
				case '}':
					if (c != '{') {
						System.out.println("Not balence");
						return;
					}
					break;
				case ']':
					if (c != '[') {
						System.out.println("Not balence");
						return;
					}
					break;
				case '(':
					if (c != ')') {
						System.out.println("Not balence");
						return;
					}
					break;
				}
			}
		}
		if (stk.empty()) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not balenced");
		}
	}

}
