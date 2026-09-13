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


    public boolean check(TreeNode node,int max,int min){
        if(node==null) return true;

        if(node.val>=max||node.val<=min) return false;
        if(!check(node.left,node.val,min)) return false;
        if(!check(node.right,max,node.val)) return false;

        return true;
    }
    public boolean isValidBST(TreeNode root) {
        return check(root,Integer.MAX_VALUE,Integer.MIN_VALUE);   
    }
}
