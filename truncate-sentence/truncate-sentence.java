class Solution {
    public String truncateSentence(String s, int k) {
        s=s+" ";
        String a[]=s.split(" ");
        String str="";
        int i;
        for(i=0;i<k;i++)
        {
            str=str+a[i]+" ";
        }
        str=str.trim();
        return str;
    }
}