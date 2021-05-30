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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        helper(root,a);
        return a;
    }
    public void helper(TreeNode root,ArrayList a){
        if(root!=null)
        {
            helper(root.left,a);
            a.add(root.val);
            helper(root.right,a);
        }
    }
}