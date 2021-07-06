/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode middle=mid(head);
        ListNode next=middle.next;
        middle.next=null;
        ListNode fh=sortList(head);
        ListNode sh=sortList(next);
        return mergesort(fh,sh);
    }
    public ListNode mid(ListNode head)
    {
        if(head==null)
            return head;
        ListNode slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode mergesort(ListNode l1,ListNode l2)
    {
        ListNode t=null;
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        if(l1.val>l2.val)
        {
            t=l1;
            l1=l2;
            l2=t;
        }
        ListNode i=l1,temp=null;
        while(l1!=null && l2!=null)
        {
            while(l1!=null && l1.val<=l2.val)
            {
                temp=l1;
                l1=l1.next;
            }
            temp.next=l2;
            t=l1;
            l1=l2;
            l2=t;
        }
        return i;
    }
}