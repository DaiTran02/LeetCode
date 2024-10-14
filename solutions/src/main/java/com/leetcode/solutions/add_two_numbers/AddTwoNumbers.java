package com.leetcode.solutions.add_two_numbers;

public class AddTwoNumbers {
	public ListNode doIt(ListNode l1,ListNode l2) {
		ListNode dummy = new ListNode();
		ListNode res = dummy;
		
		int total = 0;
		int carry = 0;
		
		while(l1 != null ||l2 != null || carry != 0) {
			total = carry;
			
			if(l1 != null) {
				total += l1.val;
				l1 = l1.next;
			}
			
			if(l2 != null) {
				total += l2.val;
				l2 = l2.next;
			}
			
			int num = total % 10;
			
			carry = total /10;
			
			dummy.next = new ListNode(num);
			dummy = dummy.next;
			
		}
		
		return res.next;
	}
	
	public static void main(String[] args) {
		AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
		ListNode l1 = new ListNode(3);
		l1.next = new ListNode(9);
		l1.next.next = new ListNode(1);
		l1.next.next.next = new ListNode(8);
		
		ListNode l2 = new ListNode(2);
		l2.next = new ListNode(2);
		l2.next.next = new ListNode(5);
		
		ListNode result = addTwoNumbers.doIt(l1, l2);
		
		while(result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	}
}
