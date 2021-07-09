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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int l=inorder.length;
        TreeNode node=build(inorder,postorder,0,l-1,0,l-1);
        return node;
    }
    public TreeNode build(int in[],int p[],int ins,int ine,int ps,int pe)
    {
        if(ins>ine)
            return null;
        int rootdata=p[pe];
        int i=0;
        for(i=ins;i<=ine;i++)
        {
            if(in[i]==rootdata)
                break;
        }
        int lins=ins;
        int line=i-1;
        int lps=ps;
        int lpe=line-lins+lps;
        int rins=i+1;
        int rine=ine;
        int rps=lpe+1;
        int rpe=pe-1;
        TreeNode root=new TreeNode(rootdata);
        root.left=build(in,p,lins,line,lps,lpe);
        root.right=build(in,p,rins,rine,rps,rpe);
        return root;
    }
}