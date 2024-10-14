package com.leetcode.solutions.palidrome_number;

public class PalidromeNumber {
	public boolean isPalidrore(int x) {
		
		if(x < 0) {
			return false;
		}
		
		String value = String.valueOf(x);
		String result = "";
		for(int i = value.length()-1;i >=0; i--) {
			result = result + value.charAt(i);
		}
		
		long intResult = Long.valueOf(result);
		
		if(x-intResult == 0)
			return true;
		
		return false;
	}
	
	public static void main(String[] args) {
		PalidromeNumber palidromeNumber = new PalidromeNumber();
		System.out.println("Check: "+palidromeNumber.isPalidrore(1234567899));
	}

}
