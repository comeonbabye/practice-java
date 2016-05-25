package com.practice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 反转链表
 * @see http://www.programcreek.com/2014/05/leetcode-reverse-linked-list-java/
 * @author tony
 *
 */
public class ReverseLinkList {

	protected static final Logger log = LoggerFactory.getLogger(ReverseLinkList.class);
	
	public static void main(String[] args) {
		
		ReverseLinkList reverseLinkList = new ReverseLinkList();
		ListNode head = reverseLinkList.makeLinkList();
		reverseLinkList.printListNode(head);
		head = reverseLinkList.reverseListWithRecursive(head);
		reverseLinkList.printListNode(head);
	}
	
	
	public void printListNode(ListNode head) {
		if(head != null) {
			log.info("{}", head);
		}
	}
	
	public ListNode makeLinkList() {
		ListNode head = new ListNode("");
		ListNode next = head;
		for(int i=0; i<10; i++) {
			next.next = new ListNode(i+"");
			next = next.next;
		}
		return head;
	}

	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null)
			return head;

		ListNode p1 = head;
		ListNode p2 = p1.next;

		head.next = null;
		while (p1 != null && p2 != null) {
			ListNode t = p2.next;
			p2.next = p1;
			p1 = p2;
			p2 = t;
		}

		return p1;
	}
	
	/**
	 * 递归处理
	 * @param head
	 * @return
	 */
	public ListNode reverseListWithRecursive(ListNode head) {
	    if(head==null || head.next == null)
	        return head;
	 
	    //get second node    
	    ListNode second = head.next;
	    //set first's next to be null
	    head.next = null;
	 
	    ListNode rest = reverseListWithRecursive(second);
	    second.next = head;
	 
	    return rest;
	}
}
