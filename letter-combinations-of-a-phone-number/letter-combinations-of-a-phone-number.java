import java.io.*;
import java.util.*;
class Solution {
    public List<String> letterCombinations(String digits) {
        
        int l=digits.length(),i;
        ArrayList<String> a=new ArrayList<String>();
        if(l==0)
            return a;
        char ch=digits.charAt(0);
        Hashtable<Character,String> h=new Hashtable<Character,String>();
        h.put('2',"abc");
        h.put('3',"def");
        h.put('4',"ghi");
        h.put('5',"jkl");
        h.put('6',"mno");
        h.put('7',"pqrs");
        h.put('8',"tuv");
        h.put('9',"wxyz");
        String s=h.get(ch);
        for(i=0;i<s.length();i++)
        {
            a.add(Character.toString(s.charAt(i)));
        }
        for(i=1;i<l;i++)
        {
            ch=digits.charAt(i);
            s=h.get(ch);
            a=compute(a,s);
        }
        return a;
    }
    public ArrayList<String> compute(ArrayList a, String str)
    {
        int len=a.size(),c=0,i;
        String s1="";
        while(c<len)
        {
            s1=(String)a.get(0);
            a.remove(0);
            for(i=0;i<str.length();i++)
            {
                a.add(s1+str.charAt(i));
            }
            ++c;
        }
        return a;
    }
}