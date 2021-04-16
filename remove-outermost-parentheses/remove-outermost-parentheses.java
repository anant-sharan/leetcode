import java.util.*;
class Solution {
    public String removeOuterParentheses(String S) {
        int l=S.length(),i,c=0;
        String str="",s="";
        Stack<Character> st=new Stack<Character>();
        for(i=0;i<l;i++)
        {
            char ch=S.charAt(i);
            if(ch=='(')
            {
                ++c;
                st.push(ch);
            }
            if(ch==')')
            {
                --c;
                st.push(ch);
            }
            if(c==0)
            {
                st.pop();
                while(st.size()>1)
                {
                    str=st.pop()+str;
                }
                st.pop();
                s=s+str;
	            str="";
            }
        }
        return s;     
    }
}