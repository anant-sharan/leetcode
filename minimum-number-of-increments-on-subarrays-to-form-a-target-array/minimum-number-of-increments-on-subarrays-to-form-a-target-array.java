class Solution {
    public int minNumberOperations(int[] input) {
        int count = input[0];
		
		for (int i=1;i<input.length;i++) {
			if (input[i] > input[i-1]) {
				count += input[i] - input[i-1];
			}
		}
		
		return count;  
    }
}