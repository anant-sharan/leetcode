class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int l1=s1.length(),l2=s2.length(),i,c=0;
        if(l1!=l2)
            return false;
        if(s1.equals(s2))
            return true;
        int a1[]=new int[26];
        int a2[]=new int[26];
        for(i=0;i<l1;i++)
        {
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);
            a1[ch1-97]=++a1[ch1-97];
            a2[ch2-97]=++a2[ch2-97];
        }
        for(i=0;i<l1;i++)
        {
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);
            if(ch1!=ch2)
            {
                ++c;
                if(a1[ch1-97]!=a2[ch1-97] || a1[ch2-97]!=a2[ch2-97])
                    return false;
            }
        }
        if(c==2)
            return true;
        else
            return false;
    }
}