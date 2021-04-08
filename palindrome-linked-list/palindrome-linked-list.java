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
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head,i=head;
        int x=0;
        String s="";
        while(temp!=null)
        {
            s=temp.val+s;
            temp=temp.next;
        }
        while(i!=null)
        {
            if(i.val!=Integer.parseInt(Character.toString(s.charAt(x))))
                return false;
            else
                i=i.next;
            ++x;
        }
        return true;
    }
}