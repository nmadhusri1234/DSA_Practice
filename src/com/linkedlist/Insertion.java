package com.linkedlist;

public class Insertion {
	
	public static ListNode insertAtFront(ListNode head,int value)
	{
		//creating new node to insert
		ListNode newNode = new ListNode(value);
		//assign new node to head
		newNode.next = head;
		head = newNode;
		
		//return head;
		
		ListNode newN = new ListNode(value,head);
		return newN;
	}
	
	public static ListNode insertAtEnd(ListNode head,int value)
	{
		ListNode newNode = new ListNode(value);
		ListNode temp = head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next = newNode;
		return head;
	}
	
	public static ListNode insertAtK(ListNode head,int value,int k)
	{
		int count=0;
		ListNode temp = head;
		
		while(temp!=null)
		{
			count++;
			if(count==k-1)
			{
				ListNode newNode = new ListNode(value);
				newNode.next = temp.next;
				temp.next = newNode;
				
				
//				temp.next = newNode; //losing the connection to the next node
//				newNode.next = temp.next.next;
			}
			temp = temp.next;
		}
		
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
		traverse(head);
			
		head = insertAtEnd(l1,100);
		System.out.println("\n\nAfter inserting at ending: ");
		traverse(head);
		
		head = insertAtK(l1,700,3);
		System.out.println("\n\nAfter inserting at K: ");
		traverse(head);
		

	}

}
