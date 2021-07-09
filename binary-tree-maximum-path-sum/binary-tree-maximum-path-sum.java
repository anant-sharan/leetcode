/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        height(root);
        return max;
    }
    public int height(TreeNode root)
    {
        if(root==null)
            return 0;
        int left=height(root.left);
        int right=height(root.right);
        int t=Math.max(Math.max(left,right)+root.val,root.val);
        int res=Math.max(left+right+root.val,t);
        max=Math.max(max,res);
        return t;
    }
}