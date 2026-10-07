package com.linkedlist;

public class Deletion {
	
	public static ListNode deletionAtFront(ListNode head)
	{
		head = head.next;
		return head;
	}
	
	public static ListNode deletionAtEnd(ListNode head)
	{
		ListNode temp = head;
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		temp.next = null;
		
		return head;
		
	}
	
	public static ListNode deletionAtK(ListNode head,int k)
	{
		ListNode temp = head;
		int count =0;
		
		while(temp!=null)
		{
			count++;
			if(count == k-1)
			{
				temp.next = temp.next.next;
			}
			temp=temp.next;
		}
		return head;
		
//		ListNode temp = head;
//		
//		for(int i=0;i<k-1;i++)
//		{
//			temp = temp.next;
//			
//		}
//		ListNode nodeToDel = temp.next;
//		ListNode nextNode = nodeToDel.next;
//		temp.next = nextNode;
//		return head;
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
		
		ListNode head ;
		
		System.out.println("Normal traverse: ");
		traverse(l1);
		
		System.out.println("\nAfter deletion at k: ");
		head = deletionAtK(l1,3);
		traverse(head);                            
		
		System.out.println("\nAfter deletion at front: ");
		head = deletionAtFront(l1);
		traverse(head);
		
		System.out.println("\nAfter deletion at end: ");
		head = deletionAtEnd(l1);
		traverse(head);
		

	}

}
