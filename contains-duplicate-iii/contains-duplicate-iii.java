class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
    if (nums == null || k < 0 || t < 0) return false;
    Map<Integer, Integer> buckets = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int bucket = (int) Math.floorDiv(nums[i], (long) t + 1);
        if (buckets.containsKey(bucket)) return true;
        else {
            buckets.put(bucket, nums[i]);
            // Cast to long as it overflows if 2147483647 - (-1) => -2147483648
            if (buckets.containsKey(bucket - 1) && nums[i] - (long) buckets.get(bucket - 1) <= t) return true;
            if (buckets.containsKey(bucket + 1) && buckets.get(bucket + 1) - (long) nums[i] <= t) return true;
            if (buckets.size() > k) {
                buckets.remove((int) Math.floorDiv(nums[i - k], (long) t + 1));
            }
        }
    }
    return false;
}
}