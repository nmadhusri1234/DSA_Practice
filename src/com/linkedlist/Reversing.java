package com.linkedlist;

public class Reversing {
	
	public static ListNode reverse(ListNode head)
	{
		ListNode curr = head;
		ListNode prev = null;
		while(curr!=null)
		{
			ListNode nextnode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextnode;
		}
		
		return prev;
	}

	public static ListNode middleNode(ListNode head)
	{
		ListNode slow = head;
		ListNode fast = head;
		while(fast!=null && fast.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	public static void traverse(ListNode head)
	{
		ListNode ptr = head;
		while(ptr!=null)
		{
			System.out.print(ptr.val+"->");
			ptr=ptr.next;
		}
	}
	
	public static void main(String[] args) {
		
		ListNode l1 = new ListNode(56);
		ListNode l2 = new ListNode(30);
		ListNode l3 = new ListNode(70);
		ListNode l4 = new ListNode(20);
		
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = null;
		
		System.out.println("Normal traverse: ");
		traverse(l1);
		
		ListNode head;
		System.out.println("\nAfter reversing: ");
		head = reverse(l1);
		traverse(head);
		
		System.out.println("\nMiddle Node: ");
		ListNode middle = middleNode(head);
		System.out.println(middle.val);;

	}

}
