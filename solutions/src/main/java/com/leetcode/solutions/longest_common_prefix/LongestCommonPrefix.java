package com.leetcode.solutions.longest_common_prefix;

import java.util.Arrays;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		Arrays.sort(strs);
		String a = strs[0];
		String b = strs[strs.length -1];
		int index = 0;

		
		for(int i = 0 ;i <= a.length() -1;i++) {
			if(index < a.length() && index<b.length() && a.charAt(index) == b.charAt(index)) {
				index++;
			}
			else
				break;
		}
 		
		return a.substring(0,index);
	}
	
	public static void main(String[] args) {
		String[] strs = {"a"};
		
		LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
		System.out.println(longestCommonPrefix.longestCommonPrefix(strs));
	}

}
