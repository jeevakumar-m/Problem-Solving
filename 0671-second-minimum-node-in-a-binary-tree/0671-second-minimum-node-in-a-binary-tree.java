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
    
    List<Integer> arr=new ArrayList<Integer>();
    
    public void inorderTraversal(TreeNode root)
    {
        if(root!=null)
        {
            inorderTraversal(root.left);
            arr.add(root.val);
            inorderTraversal(root.right);
        }
    }
    
    
    public int findSecondMinimumValue(TreeNode root) {
        inorderTraversal(root);
        Collections.sort(arr);
        int k=arr.get(0);
        System.out.println(arr);
        for(int i=1;i<arr.size();i++)
        {
            if(arr.get(i)!=k)
            {
                return arr.get(i);
            }
            k=arr.get(i);
        }
        
        return -1;
    }
}