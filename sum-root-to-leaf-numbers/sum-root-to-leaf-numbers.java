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
    int sum;
    public int sumNumbers(TreeNode root) {
        int f=sum(root,0);
        return f;
    }
    public int sum(TreeNode root,int s){
	    if(root!=null){
	    s=(s*10)+root.val;
	    if(root.left==null && root.right==null)
	        sum=sum+s;
	    sum(root.left,s);
	    sum(root.right,s);
	        
	    }
	    return sum;
	}
}