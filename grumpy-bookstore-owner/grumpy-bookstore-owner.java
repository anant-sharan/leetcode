class Solution {
    public int maxSatisfied(int[] c, int[] g, int x) {
        if(c.length==1 && x==1){
            return c[0];
        }
        int sum=0;
        for(int i=0;i<c.length;i++){
            if(g[i]==0){
                sum+=c[i];
            }
        }
        int j=x-1;
        int k=0;
        while(k<=j){
            if(g[k]==1){
                sum=sum+c[k];
            }
            k++;
        }
        int max=sum, finalsum=0;
        j=j+1;
        for(int i=1;j<c.length;i++){
            if(g[i-1]==1){
                sum=sum-c[i-1];
            }
            if(g[j]==1){
                sum=sum+c[j];
                if(max<sum){
                    max=sum;
                }
            }
            j=j+1;

        }
        return max;
    }
}