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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> a=new ArrayList<Integer>();
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        if(root==null)
            return a;
        q.add(root);
        while(q.size()!=0)
        {
            int l=q.size();
            --l;
            while(l>0)
            {
                TreeNode rn=q.poll();
                if(rn.left!=null)
                    q.add(rn.left);
                if(rn.right!=null)
                    q.add(rn.right);
                --l;
            }
            TreeNode last=q.poll();
            a.add(last.val);
            if(last.left!=null)
                q.add(last.left);
            if(last.right!=null)
                q.add(last.right);
        }
        return a;
    }
}