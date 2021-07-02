import java.util.*;
class Solution {
    public String removeDuplicateLetters(String s) {
         int lst[]=new int[26];
        int vis[]=new int[26];
        int i,l=s.length();
        char ch;
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            lst[ch-'a']=i;    
        }
        Stack<Character> st=new Stack<Character>();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(vis[ch-'a']==1)
                continue;
            if(st.empty())
            {
                st.push(ch);
                vis[ch-'a']=1;
            }
            else if(st.peek()>ch && lst[st.peek()-'a']>i)
            {
                while(st.empty()==false && st.peek()>ch && lst[st.peek()-'a']>i)
                {
                    vis[st.peek()-'a']=0;
                    st.pop();
                }
                st.push(ch);
                vis[ch-'a']=1;
            }
            else
            {
                st.push(ch);
                vis[ch-'a']=1;
            }
        }
        String str="";
        while(st.empty()==false)
        {
            str=st.pop()+str;
        }
        return str;
    }
}