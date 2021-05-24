public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int i,num=0,mask=1;
        
        for(i=0;i<32;i++)
        {
            mask=1;
            mask=mask << i;
            num=num << 1;
            if((n & mask)!=0)
                num=num+1;
            else
                num=num+0;
            
        }
            
        return num;
        
    }
}