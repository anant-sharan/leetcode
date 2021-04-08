import java.util.*;
class Solution {
    public List<String> wordSubsets(String[] A, String[] B) {
        Hashtable<Character, Integer> h1=new Hashtable<Character, Integer>();
        List<String> a=new ArrayList<String>();
        int al=A.length,bl=B.length,i,j;
        char ch;
        for(i=0;i<bl;i++)
        {
            String s=B[i];
            int l=s.length();
            Hashtable<Character, Integer> h2=new Hashtable<Character, Integer>();
            for(j=0;j<l;j++)
            {
                ch=s.charAt(j);
                if(h2.containsKey(ch))
                    h2.put(ch,h2.get(ch)+1);
                else
                    h2.put(ch,1);
            }
            Set<Character> set=h2.keySet();
            
            for(char k: set)
            {
                if(h1.containsKey(k))
                    h1.put(k,Math.max((int)h1.get(k),(int)h2.get(k)));
                else
                    h1.put(k,(int)h2.get(k));
            }
        }
        for(i=0;i<al;i++)
        {
            String s=A[i];
            int l=s.length();
            int c=0;
            Hashtable<Character, Integer> h3=new Hashtable<Character, Integer>();
            for(int z=0;z<l;z++)
            {
                ch=s.charAt(z);
                if(h3.containsKey(ch))
                    h3.put(ch,h3.get(ch)+1);
                else
                    h3.put(ch,1);
            }
            Set<Character> set=h1.keySet();
            for(char k: set)
            {
                if(h3.containsKey(k))
                {
                    if(h1.get(k)<=h3.get(k))
                        continue;
                    else
                        ++c;
                }
                else
                    ++c;
            }
            if(c==0)
                a.add(s);
        }
        return a;
    }
}