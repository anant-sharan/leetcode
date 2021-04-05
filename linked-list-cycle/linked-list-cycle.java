/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp=null;
        temp=head;
        while(temp!=null)
        {
            if(temp.val==Integer.MIN_VALUE)
                return true;
            else
                temp.val=Integer.MIN_VALUE;
            temp=temp.next;
        }
        return false;
    }
}