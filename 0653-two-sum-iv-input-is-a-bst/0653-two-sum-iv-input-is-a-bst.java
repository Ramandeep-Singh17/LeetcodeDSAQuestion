class Solution {
    public boolean findTarget(TreeNode root, int k) {
         ArrayList<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        int n = arr.size();
        int i =0;
        int j=n-1;
        while(i<j){
            int sum=arr.get(i)+arr.get(j);
            if(sum==k) return true;
            else if(sum>k) j--;
            else{
                i++;
            }
         } 
            return false;
    }
     private void inorder(TreeNode root, ArrayList<Integer> arr) {
        if (root == null) return;
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
    }
}
