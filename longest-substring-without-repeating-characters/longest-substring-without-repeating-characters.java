import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        char ch;
        int a[]= {0,0};
        if(s.length()==0)
            return 0;
		int i,startidx=0;
		Hashtable h=new Hashtable();
		for(i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(h.containsKey(ch))
			{
				
				startidx=Math.max(startidx,(int)h.get(ch)+1);
				h.put(ch, i);
				if(i-startidx>a[1]-a[0])
				{
					a[0]=startidx;
					a[1]=i;
				}
			}
			else
			{
				h.put(ch,i);
				if(i-startidx>a[1]-a[0])
				{
					a[0]=startidx;
					a[1]=i;
				}
			}
		}
		return a[1]+1-a[0];
    }
}