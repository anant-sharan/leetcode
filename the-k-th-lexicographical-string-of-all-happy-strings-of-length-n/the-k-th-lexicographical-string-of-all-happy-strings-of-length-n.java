class Solution {
    char arr[]={'a','b','c'};
    ArrayList<String> a=new ArrayList<String>();
    public String getHappyString(int n, int k) {
       String s="";
        create(n,s);
        if(k>a.size())
            return "";
        else
            return a.get(k-1);
    }
    public void create(int n,String s)
    {
        int i;
    for(i=0;i<3;i++)
    {
    	if(s.length()==n)
    	{
    		a.add(s);
    		break;
    	}
    	if(s.length()==0)
    	{
    		s=s+arr[i];
    		create(n,s);
    		s="";
    	}
    	else
    	{
    		if(s.charAt(s.length()-1)!=arr[i])
    		{
    			s=s+arr[i];
    			create(n,s);
    			s=s.substring(0,s.length()-1);
    		}
    	}
    }
    }
}