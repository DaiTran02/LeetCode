package com.leetcode.solutions.valid_parenthese;

import java.util.Stack;

public class ValidParentTheses {
	public boolean isValid(String s) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for(char i : s.toCharArray()) {
			if(i == '('||i == '{'||i == '[') {
				stack.push(i);
			}else {
				if(stack.isEmpty()) {
					return false;
				}
				if(i == ')' && stack.peek() == '(') {
					stack.pop();
				}else if(i == '}' && stack.peek() == '{') {
					stack.pop();
				}else if(i == ']' && stack.peek() == '[') {
					stack.pop();
				}else {
					return false;
				}
			}
		}
		
		return stack.isEmpty();
		
	}
	
	public static void main(String[] args) {
		ValidParentTheses validParentTheses = new ValidParentTheses();
		String s = "(]";
		System.out.println(validParentTheses.isValid(s));
	}

}
