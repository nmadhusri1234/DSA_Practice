package com.linkedlist;

public class Insertion {
	
	public static ListNode insertAtFront(ListNode head,int value)
	{
		//creating new node to insert
		ListNode newNode = new ListNode(value);
		//assign new node to head
		newNode.next = head;
		head = newNode;
		
		return head;
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
		head = insertAtFront(l1,60);
		
		System.out.println("\nAfter insertion at beginning: ");
		traverse(head);
			

	}

}
