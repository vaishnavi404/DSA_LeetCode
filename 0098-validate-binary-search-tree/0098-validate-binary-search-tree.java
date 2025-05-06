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
    public boolean isValidBST(TreeNode root) {
        if(root==null){return true;}
       Queue<TreeNode> queue= new LinkedList<>();
       queue.add(root);
       
       while(!queue.isEmpty()){
        TreeNode QItem= queue.poll();

        if(QItem.left!=null && (QItem.val<=QItem.left.val)){return false;}
        if(QItem.right!=null && (QItem.val>=QItem.right.val)){return false;}

        if(QItem.left!=null) queue.add(QItem.left);
        if(QItem.right!=null) queue.add(QItem.right);

       }
       return true;
    }}
   