import java.util.*;
class Solution {
    public String minWindow(String s, String t) {
        Hashtable<Character,Integer> sh=new Hashtable<Character,Integer>();
        Hashtable<Character,Integer> th=new Hashtable<Character,Integer>();
        int i,j=0,sl=s.length(),tl=t.length(),n=0,min=Integer.MAX_VALUE;
        char ch;
        String str="";
        for(i=0;i<tl;i++)
        {
            ch=t.charAt(i);
            if(th.containsKey(ch))
                th.put(ch,th.get(ch)+1);
            else
                th.put(ch,1);
        }
        for(i=0;i<sl;i++)
        {
            ch=s.charAt(i);
            if(th.containsKey(ch))
            {
                if(sh.containsKey(ch))
                {
                    sh.put(ch,sh.get(ch)+1);
                    if(sh.get(ch)<=th.get(ch))
                    {
                        ++n;
                    }
                }
                else
                {
                    sh.put(ch,1);
                    ++n;
                }
            }
            if(n==tl)
            {
                while(n==tl)
                {
                    ch=s.charAt(j);
                    if(sh.containsKey(ch))
                    {
                        if(sh.get(ch)-1<th.get(ch))
                        {
                            --n;
                            sh.put(ch,sh.get(ch)-1);
                            if((i-j)<min)
	                            {
	                                min=i-j;
	                                str=s.substring(j,i+1);
	                            }
	                            ++j;
                        }
                        else
                        {
                            sh.put(ch,sh.get(ch)-1);
                            ++j;
                            if((i-j)<min)
                            {
                                min=i-j;
                                str=s.substring(j,i+1);
                            }
                        }
                    }
                    else
                    {
                        ++j;
                        if((i-j)<min)
                            {
                                min=i-j;
                                str=s.substring(j,i+1);
                            }
                    }
                }
            }
        }
        return str;
    }
}