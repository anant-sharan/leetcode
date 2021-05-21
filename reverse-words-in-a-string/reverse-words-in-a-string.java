class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        s=s+" ";
        int l=s.length(),i;
        String str="";
        StringBuffer word=new StringBuffer();
        for(i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                word.append(ch);
            }
            else
            {
                if(word.length()!=0)
                {
                    str=" "+String.valueOf(word)+str;
                    word.setLength(0);
                }
            }
        }
        str=str.trim();
        return str;
    }
}