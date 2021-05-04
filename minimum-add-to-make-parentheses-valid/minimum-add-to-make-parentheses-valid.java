class Solution {
    public int minAddToMakeValid(String S) {
        int l=S.length(),i;
        Stack<Character> st=new Stack<Character>();
        char ch;
        for(i=0;i<l;i++)
        {
            ch=S.charAt(i);
            if(st.isEmpty())
            {
                st.push(ch);
            }
            else if(ch=='(')
            {
                st.push(ch);
            }
            else if(ch==')')
            {
                if(st.peek()=='(')
                {
                    st.pop();
                }
                else
                    st.push(ch);
            }
        }
        return st.size();
    }
}