package com.leetcode.solutions.search_insert_position;

import java.util.Arrays;

public class SearchInsertPosition {
	
	public int searchInsert(int[] nums,int target) {
		
		int result = 0;
		
		Arrays.sort(nums);
		
		int index = Arrays.binarySearch(nums, target);
		
		if(index < 0) {
			int a[] = addItem(nums, target);
			Arrays.sort(a);
			result = Arrays.binarySearch(a, target);
		}else {
			result = index;
		}
		
		return result;
	}
	
	public int[] addItem(int[]nums,int x) {
		int[] newArray = new int[nums.length+1];
		for(int i = 0; i < nums.length;i++) {
			newArray[i] = nums[i];
		}
		
		newArray[nums.length] = x;
		return newArray;
	}
	
	public static void main(String[] args) {
		SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
		
		int []arr = {1,2,7,3,8};
		
		System.out.println("Your index: "+searchInsertPosition.searchInsert(arr, 9));
		

	}

}
