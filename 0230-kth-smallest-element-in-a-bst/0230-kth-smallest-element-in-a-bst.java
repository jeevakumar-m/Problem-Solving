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
    List<Integer> arr= new ArrayList<>();
    
    public void inorderTraversal(TreeNode root){
        if(root!=null){
            inorderTraversal(root.left);
            arr.add(root.val);
            inorderTraversal(root.right);
        }
    }
    
    
    public int kthSmallest(TreeNode root, int k) {
        inorderTraversal(root);
        return arr.get(k-1);
    }
}