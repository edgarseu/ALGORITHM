package com.seu.edu.czyLeetCode;

public class CzyList {
//	public ListNode sortList(ListNode head) {
//	    if (head == null || head.next == null) {
//	        return head;
//	    }
//	    ListNode slow = head, fast = head.next.next;
//	    while (fast != null && fast.next != null) {
//	        fast = fast.next.next;
//	        slow = slow.next;
//	    }
//	    ListNode p2 = sortList(slow.next);
//	    slow.next = null;
//	    ListNode p1 = sortList(head);
//	    return merge(p1, p2);
//	}
///*链表归并排序算法1  迭代*/
//	private ListNode merge(ListNode p1, ListNode p2) {
//	    ListNode p, dummy = new ListNode(0);
//	    p = dummy;
//	    while (p1 != null && p2 != null) {
//	        if (p1.val < p2.val) {
//	            p.next = p1;
//	            p1 = p1.next;
//	        } else {
//	            p.next = p2;
//	            p2 = p2.next;
//	        }
//	        p = p.next;
//	    }
//	    p.next = (p1==null?p2:p1);
//	    return dummy.next;
//	}
//	/*链表归并排序算法1  递归*/
//	public ListNode mergeTwoLists(ListNode l1, ListNode l2){
//        if(l1 == null) return l2;
//        if(l2 == null) return l1;
//        if(l1.val < l2.val){
//            l1.next = mergeTwoLists(l1.next, l2);
//            return l1;
//        } else{
//            l2.next = mergeTwoLists(l1, l2.next);
//            return l2;
//        }
//}
	
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	    public static ListNode sortList(ListNode head) {
//	     if (head == null || head.next == null) {
//	         return head;
//	     }
//	     ListNode slow = head, fast = head.next.next;
//	     while (fast != null && fast.next != null) {
//	         fast = fast.next.next;
//	         slow = slow.next;
//	     }
//	     ListNode p2 = sortList(slow.next);
//	     slow.next = null;
//	     ListNode p1 = sortList(head);
//	     return merge(p1, p2);
	// }

	// private ListNode merge(ListNode p1, ListNode p2) {
//	     ListNode p, dummy = new ListNode(0);
//	     p = dummy;
//	     while (p1 != null && p2 != null) {
//	         if (p1.val < p2.val) {
//	             p.next = p1;
//	             p1 = p1.next;
//	         } else {
//	             p.next = p2;
//	             p2 = p2.next;
//	         }
//	         p = p.next;
//	     }
//	     p.next = (p1==null?p2:p1);
//	     return dummy.next;
	// }

	        if (head == null || head.next == null)
	            return head;
	        ListNode f = head.next.next;
	        ListNode p = head;
	        while (f != null && f.next != null) {
	            p = p.next;
	            f =  f.next.next;
	        }
	        
	        ListNode temp=p.next;
	        p.next=null;
	        ListNode h1=sortList(head);
	        //p.next=null;
	        ListNode h2 = sortList(temp);
	        //p.next = null;//保证每次分半之后  前半都有一个结尾标志null；；；；；；
	        
	        return merge(h1, h2);
	    }
	    public static ListNode merge(ListNode h1, ListNode h2) {
	        ListNode hn = new ListNode(Integer.MIN_VALUE);
	        ListNode c = hn;
	        while (h1 != null && h2 != null) {
	            if (h1.val < h2.val) {
	                c.next = h1;
	                h1 = h1.next;
	            }
	            else {
	                c.next = h2;
	                h2 = h2.next;
	            }
	            c = c.next;
	        }
	        if (h1 != null)
	            c.next = h1;
	        if (h2 != null)
	            c.next = h2;
	        return hn.next;
	    }
	
	public static void main(String[] args){
		ListNode head=new ListNode(6);
		head.next=new ListNode(3);
		head.next.next=new ListNode(5);
		head.next.next.next=new ListNode(4);
		head=sortList(head);
		while(head!=null){
			System.out.println(head.val);
			head=head.next;
		}
	}
}
