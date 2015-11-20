package Leetcode;

public class ReversePrint {
	private static void printNthFromEnd(ListNode head,int n){
		if(head==null){
			return;
		}
		ListNode dummy=new ListNode(0);
		dummy.next=head;
		ListNode node=dummy;
		for(int i=0;i<n;i++){
			node=node.next;
		}
		System.out.println(node.val);
	}
	private static void reverse(ListNode head){
		if(head==null){
			return;
		}
		ListNode p=head;
		int length=1;
		while(p!=null){
			p=p.next;
			length++;
		}
		for(int i=length;i>=1;i--){
			printNthFromEnd(head,i);
		}
	}
}
