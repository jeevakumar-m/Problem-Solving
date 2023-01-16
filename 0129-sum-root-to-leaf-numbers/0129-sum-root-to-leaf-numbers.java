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
    static int c=0;
    int sum=0;
    int tot=0;
    public void traverse(TreeNode root)
    {
        if(root!=null)
        {
            sum=(sum*10)+root.val;
            if(root.left==null && root.right==null)
            {
                tot+=sum;
               
            }
             
            System.out.println("root value=" +root.val);
            System.out.println("sum=" + sum);
            System.out.println("tot="+ tot);
            traverse(root.left);
            traverse(root.right);
            sum=(sum-root.val)/10;
        }

        
    }
    public int sumNumbers(TreeNode root) {
        traverse(root);
        return tot;
    }
}