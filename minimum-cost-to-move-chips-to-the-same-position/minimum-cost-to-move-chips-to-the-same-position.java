import java.util.*;
class Solution {
    public int minCostToMoveChips(int[] position) {
        
        int i,l=position.length,odd=0,even=0;
        for(i=0;i<l;i++)
        {
            if(position[i]%2==0)
                ++even;
            else
                ++odd;
        }
        int min=Math.min(even,odd);
        return min;
    }
}