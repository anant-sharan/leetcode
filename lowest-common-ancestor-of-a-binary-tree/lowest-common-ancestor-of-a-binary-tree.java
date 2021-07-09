/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> a=new ArrayList<TreeNode>();
        ArrayList<TreeNode> b=new ArrayList<TreeNode>();
        path(root,p,a);
        path(root,q,b);
        int i=a.size()-1,j=b.size()-1;
        while(i>=0 && j>=0)
        {
            if(a.get(i).val==b.get(j).val)
            {
                --i;
                --j;
            }
            else
                break;
        }
        return a.get(i+1);
    }
    public boolean path(TreeNode root,TreeNode p,ArrayList<TreeNode> a)
    {
        if(root==null)
            return false;
        if(root.val==p.val){
            a.add(root);
            return true;
        }
        if(path(root.left,p,a)){
            a.add(root);
            return true;
        }
        if(path(root.right,p,a))
        {
            a.add(root);
            return true;
        }
        return false;
    }
}