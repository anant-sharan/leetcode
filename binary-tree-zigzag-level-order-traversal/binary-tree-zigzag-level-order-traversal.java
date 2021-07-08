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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Deque<TreeNode> dq=new LinkedList<TreeNode>();
        List<List<Integer>> a=new ArrayList<List<Integer>>();
        int f=1;
        if(root==null)
            return a;
        dq.add(root);
        while(dq.size()!=0)
        {
            int l=dq.size();
            if(f%2!=0)
            {
                ArrayList<Integer> arr=new ArrayList<Integer>();
                while(l>0)
                {
                    TreeNode rn=dq.poll();
                    arr.add(rn.val);
                    if(rn.left!=null)
                        dq.add(rn.left);
                    if(rn.right!=null)
                        dq.add(rn.right);
                    --l;
                }
                a.add(arr);
            }
            else if(f%2==0)
            {
                Stack<TreeNode> s=new Stack<TreeNode>();
                while(l>0)
                {
                    TreeNode rn=dq.poll();
                    s.push(rn);
                    if(rn.left!=null)
                        dq.add(rn.left);
                    if(rn.right!=null)
                        dq.add(rn.right);
                    --l;
                }
                ArrayList<Integer> arr=new ArrayList<Integer>();
                while(s.size()!=0)
                {
                    arr.add(s.pop().val);
                }
                a.add(arr);
            }
            ++f;
        }
        return a;
    }
}