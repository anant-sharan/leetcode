import java.util.*;
import java.io.*;
class Solution {
    public int numDifferentIntegers(String word) {
        int l=word.length(),i,c=0;
        StringBuffer sb=new StringBuffer();
        for(i=0;i<l;i++)
        {
            char ch=word.charAt(i);
            if(Character.isLetter(ch))
                sb.append(" ");
            else
                sb.append(ch);
        }
        String s=String.valueOf(sb),str="";
        s=s.trim();
        s=s+" ";
        Hashtable<String,Integer> h=new Hashtable<String,Integer>();
        for(i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                str=str+ch;
            }
            else
            {
                int len=str.length();
                if(len>0)
                {
                    int j=0;
                    if(str.charAt(0)=='0')
                    {
                        while(j<len)
                        {
                            if(str.charAt(j)=='0')
                                ++j;
                            else
                                break;
                        }
                        if(j<len)
                            str=str.substring(j);
                        else
                            str="0";
                    }
                    if(h.containsKey(str)==false)
                    {
                        h.put(str,0);
                        ++c;
                    }
                    str="";
                }
            }
        }
        return c;
    }
}