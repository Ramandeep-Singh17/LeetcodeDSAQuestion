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
     public void dfs(TreeNode root,List <Integer> ans ) {
        if (root==null) return;
        dfs(root.left,ans);// answer pass karenge since 2 chiz hai dfs me 
         dfs(root.right,ans);
         ans.add(root.val);
       
     }

    public List<Integer> postorderTraversal(TreeNode root) {
          ArrayList <Integer> ans= new ArrayList<>();
           dfs(root,ans);
           return ans;
    }
}