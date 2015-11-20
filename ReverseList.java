package Leetcode;

public class ReverseList {
	private static ListNode reverse(ListNode head) {
		// TODO Auto-generated method stub
		if(head == null){
			return head;
		}
		
		ListNode pre, post,tmp;
		pre = head;
		post = pre.next;
		
		while(post!=null){
			tmp = post.next;
			post.next =pre;
			pre=post;
			post=tmp;
		}
		
		head.next = null;
		head = pre;
		
		return head;
	}
}
