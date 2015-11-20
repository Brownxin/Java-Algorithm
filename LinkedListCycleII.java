package Leetcode;

public class LinkedListCycleII {
	public ListNode detectCycle(ListNode head){
		if(head==null || head.next==null){
			return null;
		}
		ListNode fast=head,slow=head;
		while(fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast){
				break;
			}
		}
		if(slow!=fast){
			return null;
		}
		slow=head;
		while(slow!=fast){
			slow=slow.next;
			fast=fast.next;
		}
		return slow;
	}
}