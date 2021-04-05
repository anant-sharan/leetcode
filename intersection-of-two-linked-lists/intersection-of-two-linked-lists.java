/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1=0,l2=0,n=0,k,c=0;
        ListNode i=headA,j=headB;
        while(i!=null)
        {
            ++l1;
            i=i.next;
        }
        while(j!=null)
        {
            ++l2;
            j=j.next;
        }
        
        i=headA;
        j=headB;
        if(l1>l2)
        {
            n=l1-l2;
            for(k=1;k<=n;k++)
            {
                i=i.next;
            }
        }
        if(l1<l2)
        {
            n=l2-l1;
            for(k=1;k<=n;k++)
            {
                j=j.next;
            }
        }
        if(i==j)
            return i;
        ListNode temp=null;
        while(i!=null && j!=null)
        {
            if(i.next==j.next)
            {
                ++c;
                temp=i.next;
                break;
            }
            i=i.next;
            j=j.next;
        }
        
            return temp;
    }
}