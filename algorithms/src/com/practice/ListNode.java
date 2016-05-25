package com.practice;

public class ListNode {

	public Object val;
    public ListNode next;
    
    public ListNode(Object x) {
        this.val = x;
        this.next = null;
    }

	@Override
	public String toString() {
		return val == null ? "" : val.toString() + "\t" + (next == null ? "" : next.toString()); 
	}
    
    
}
