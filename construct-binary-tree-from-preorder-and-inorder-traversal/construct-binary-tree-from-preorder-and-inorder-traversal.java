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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int l=preorder.length;
        TreeNode node=build(preorder,inorder,l,0,l-1,0,l-1);
        return node;
    }
    public TreeNode build(int p[],int in[],int l,int ps,int pe,int ins,int ine)
    {
        if(ins>ine)
            return null;
        int rootdata=p[ps];
        int i;
        for(i=ins;i<=ine;i++)
        {
            if(in[i]==rootdata)
            {
                break;
            }
        }
        int lps=ps+1;
        int lins=ins;
        int line=i-1;
        int lpe=line-lins+lps;
        int rps=lpe+1;
        int rpe=pe;
        int rins=i+1;
        int rine=ine;
        TreeNode root=new TreeNode(rootdata);
        root.left=build(p,in,l,lps,lpe,lins,line);
        root.right=build(p,in,l,rps,rpe,rins,rine);
        return root;
    }
}