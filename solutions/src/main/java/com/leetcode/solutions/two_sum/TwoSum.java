package com.leetcode.solutions.two_sum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public int[] sum(int []nums,int target) {
		int n = nums.length;
		for(int i = 0;i < n-1;i++) {
			for(int j = i+1;j < n;j++) {
				if(nums[i] + nums[j] == target) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {};
	}
	
	public int[] sumNew(int []nums,int target) {
		int n = nums.length;
		Map<Integer, Integer> mapNum = new HashMap<Integer, Integer>();
		for(int i = 0;i < n;i++) {
			int check = target - nums[i];
			if(mapNum.containsKey(check)) {
				return new int[] {mapNum.get(check),i};
			}
			mapNum.put(nums[i], i);
		}
		return new int[] {};
	}
	
	public static void main(String[] args) {
		TwoSum toSum = new TwoSum();
		int []num = {2,4,5,7,1,3,5};
		int []result = toSum.sum(num, 7);
		for(int i = 0; i < result.length;i++) {
			System.out.println("First: "+result[i]);
		}
		
		int []result2 = toSum.sumNew(num, 5);
		for(int i = 0;i < result2.length;i++) {
			System.out.println("Seccond: "+result2[i]);
		}
	}

}
