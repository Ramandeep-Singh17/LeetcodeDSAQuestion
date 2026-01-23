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
    static boolean flag;
    public boolean isBalanced(TreeNode root) {
       if(root==null) return true;
       flag=true;// hm maanliye ki ye true hai;
       levels(root);
       return flag;
        
    }
    private int levels(TreeNode root){
        if(root==null) return 0;
        int leftlevel=levels(root.left);
        int rightlevel=levels(root.right);
        // imp line
        if(Math.abs(leftlevel-rightlevel)>1){
                     flag=false;
                     
        }
        return 1+Math.max(leftlevel,rightlevel);
    }
}