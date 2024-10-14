package com.leetcode.solutions.roman_to_integer;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	public int romanToInt(String s) {
		int result = 0;
		Map<Character, Integer> m = new HashMap<>();
		m.put('I', 1);
		m.put('V', 5);
		m.put('X', 10);
		m.put('L', 50);
		m.put('C', 100);
		m.put('D', 500);
		m.put('M', 1000);
		for(int i=0;i<s.length();i++) {
			if(i<s.length()-1 && m.get(s.charAt(i)) < m.get(s.charAt(i+1))) {
				result -= m.get(s.charAt(i));
				System.out.println("Result tren ne: "+result);
			}else {
				result += m.get(s.charAt(i));
				System.out.println("Result duoi ne: "+result);
			}
		}

		return result;
	}

	public static void main(String[] args) {
		RomanToInteger romanToInteger = new RomanToInteger();
		System.out.println(romanToInteger.romanToInt("MCMXCIV"));
	}

}
