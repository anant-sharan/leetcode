import java.util.*;
class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        if(sentence2.length()>sentence1.length())
        {
            String s=sentence2;
            sentence2=sentence1;
            sentence1=s;
        }
        String s2[]=sentence2.split(" ");
        String s1[]=sentence1.split(" ");
        int l2=s2.length,l1=s1.length,i,c=0,j;
        if(l2==1)
        {
            if(s1[0].equals(s2[0]) || s1[l1-1].equals(s2[0]))
                return true;
            else
                return false;
        }
        for(i=0;i<l2;i++)
        {
            if(s1[i].equals(s2[i])==false)
            {
                break;
            }
            ++c;
        }
        if(c==l2)
            return true;
        i=l2-1;
        j=l1-1;
        while(i>=0)
        {
            if(s1[j].equals(s2[i])==false)
            {
                break;
            }
            --i;
            --j;
            ++c;
        }
        if(c>=l2)
            return true;
        else
            return false;
    }
}