class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] a = new Integer[arr.length];
        for (int i = 0; i < a.length; ++i)
            a[i] = arr[i];
     
        Arrays.sort(a, Comparator.comparing(i -> Integer.bitCount(i) * 10000 + i));
        for (int i = 0; i < a.length; ++i)
            arr[i] = a[i];
        int i=0,j=arr.length-1;
        /*while(i<=j)
        {
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            ++i;
            --j;
        }*/
        return arr;
    }
}