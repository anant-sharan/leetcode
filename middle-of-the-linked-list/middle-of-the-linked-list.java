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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head,t=head;
        int c=0;
        while(temp!=null)
        {
            temp=temp.next;
            ++c;
        }
        c=c/2;
        while(c>0)
        {
            t=t.next;
            --c;
        }
        return t;
    }
}