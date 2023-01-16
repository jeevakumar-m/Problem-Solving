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
    List<Integer> treeList= new ArrayList<>();
    
    public void traverse(TreeNode root)
    {
         if(root!=null)
        {
            inorderTraversal(root.left);
            treeList.add(root.val);
            inorderTraversal(root.right);
        }
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        traverse(root);
        return treeList;
       
        
    }
}