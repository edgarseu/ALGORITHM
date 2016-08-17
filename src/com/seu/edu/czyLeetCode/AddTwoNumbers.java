package com.seu.edu.czyLeetCode;
class ListNode {
    int val;
	ListNode next;
    ListNode(int x) { val = x; }
 }
public class AddTwoNumbers {
    ListNode l=new ListNode(-1);
    ListNode result=l;
   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       int temp=-1;
       int cur=0;
       if(l1==null&&l2==null){
           return null;
       }
       while(l1!=null||l2!=null){
           if(l1!=null&&l2!=null)
           {
           temp=l1.val+l2.val+cur;
           cur=temp/10;
           if(temp>=10)
           l.next=new ListNode(temp-10);
           else  l.next=new ListNode(temp);
           
           l1=l1.next;
           l2=l2.next;
           l=l.next;
           }
       if(l1==null&&l2!=null){
           temp=l2.val+cur;
           cur=temp/10;
           if(temp>=10)
            l.next=new ListNode(temp-10);
           else  
            l.next=new ListNode(temp);
           l2=l2.next;
           l=l.next;
       }
       if(l2==null&&l1!=null){
           temp=l1.val+cur;
           cur=temp/10;
           if(temp>=10)
            l.next=new ListNode(temp-10);
           else  
            l.next=new ListNode(temp);
           l1=l1.next;
           l=l.next;
       }

       }
    if(l1==null&&l2==null&&cur!=0){
           l.next=new ListNode(cur);
           l=l.next;
       }
       return result.next;
   }
   
   
	    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
	        ListNode c1 = l1;
	        ListNode c2 = l2;
	        ListNode sentinel = new ListNode(0);
	        ListNode d = sentinel;
	        int sum = 0;
	        while (c1 != null || c2 != null) {
	            sum /= 10;
	            if (c1 != null) {
	                sum += c1.val;
	                c1 = c1.next;
	            }
	            if (c2 != null) {
	                sum += c2.val;
	                c2 = c2.next;
	            }
	            d.next = new ListNode(sum % 10);
	            d = d.next;
	        }
	        if (sum / 10 == 1)
	            d.next = new ListNode(1);
	        return sentinel.next;
	    }
	}
