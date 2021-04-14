import java.util.*;
class Solution {
    public String customSortString(String S, String T) {
        int tl=T.length(),sl=S.length();
        Hashtable<Character,Integer> h=new Hashtable<Character,Integer>();
        int i;
        for(i=0;i<tl;i++)
        {
            char ch=T.charAt(i);
            if(h.containsKey(ch))
                h.put(ch,h.get(ch)+1);
            else
                h.put(ch,1);
        }
        String str="";
        for(i=0;i<sl;i++)
        {
            char ch=S.charAt(i);
            if(h.containsKey(ch))
            {
                int n=h.get(ch);
                while(n>0)
                {
                    str=str+ch;
                    --n;
                }
                h.put(ch,0);
            }
        }
        Set<Character> set=h.keySet();
        for(char c:set)
        {
            if(h.get(c)!=0)
            {
                int n=h.get(c);
                while(n>0)
                {
                    str=str+c;
                    --n;
                }
            }
        }
        return str;
    }
}