import java.util.*;
class Solution {
    public String removeDuplicates(String s, int k) {
        int l=s.length(),i,c=0;
        Stack<Character> st1=new Stack<Character>();
        Stack<Integer> st2=new Stack<Integer>();
        for(i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(st1.empty())
            {
                st1.push(ch);
                st2.push(1);
            }
            else
            {
                if(st1.peek()==ch)
                {
                    st1.push(ch);
                    st2.push(st2.peek()+1);
                }
                else
                {
                    st1.push(ch);
                    st2.push(1);
                }
            }
            if(st2.peek()==k)
            {
                c=k;
            while(c>0)
            {
                st2.pop();
                st1.pop();
                --c;
            }
            }
        }
        String str="";
        while(st1.empty()==false)
        {
            str=st1.pop()+str;
        }
        return str;
    }
}