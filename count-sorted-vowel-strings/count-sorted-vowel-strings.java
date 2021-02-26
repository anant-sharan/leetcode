class Solution {
    public int countVowelStrings(int n) {
        int ans =1;
        for (int i=n; i>n-4;i--){
            ans *= (i+4);
        }
        return ans/24;
    }
}