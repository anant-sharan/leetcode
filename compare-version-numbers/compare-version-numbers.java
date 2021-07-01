class Solution {
    public int compareVersion(String version1, String version2) {
        int i,j;
        String c1[]=version1.split("[.]", 0);
        String c2[]=version2.split("[.]", 0);
        String s1[];
        int l=Math.min(c1.length,c2.length);
        int l1=c1.length,l2=c2.length;
        System.out.println(l1);
        for(i=0;i<l;i++)
        {
            if(Integer.parseInt(c1[i])<Integer.parseInt(c2[i]))
                return -1;
            else if(Integer.parseInt(c1[i])>Integer.parseInt(c2[i]))
                return 1;
        }
        System.out.println(i);
        //--i;
        if(l1>l2)
        {
            for(j=i;j<l1;j++)
            {
                if(Integer.parseInt(c1[j])>0)
                    return 1;
            }
            return 0;
        }
        else if(l1<l2)
        {
            for(j=i;j<l2;j++)
            {
                if(Integer.parseInt(c2[j])>0)
                    return -1;
            }
            return 0;
        }
        else
            return 0;
    }
}