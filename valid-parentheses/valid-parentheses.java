class Solution {
    public boolean isValid(String s) {
        int i,l=s.length();
        Stack<Character> st=new Stack<Character>();
        char ch;
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(st.isEmpty())
            {
                st.push(ch);
            }
            else if(ch=='(' || ch=='{' || ch=='[')
                st.push(ch);
            else if(ch==')')
            {
                if(st.peek()=='(')
                    st.pop();
                else
                    st.push(ch);
            }
            else if(ch=='}')
            {
                if(st.peek()=='{')
                    st.pop();
                else
                    st.push(ch);
            }
            else if(ch==']')
            {
                if(st.peek()=='[')
                    st.pop();
                else
                    st.push(ch);
            }
        }
        if(st.isEmpty())
            return true;
        else
            return false;
    }
}