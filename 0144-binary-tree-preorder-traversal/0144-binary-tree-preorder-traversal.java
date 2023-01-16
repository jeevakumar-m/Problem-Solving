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
            treeList.add(root.val);
            traverse(root.left);
            traverse(root.right);
        }
    }
    
    public List<Integer> preorderTraversal(TreeNode root) {
        traverse(root);
        return treeList;
    }
}