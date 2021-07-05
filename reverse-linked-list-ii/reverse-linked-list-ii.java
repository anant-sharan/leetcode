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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp=new ListNode(),prev=null,node=null,next=null;
        temp.next=head;
        right=right-left+1;
        while(left>0)
        {
            node=temp;
            temp=temp.next;
            --left;
        }
        System.out.println(temp.val);
        ListNode newhead=temp;
        while(right>0)
        {
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
            --right;
        }
        if(node.val!=0)
            node.next=prev;
        else
            head=prev;
        newhead.next=next;
        return head;
    }
}