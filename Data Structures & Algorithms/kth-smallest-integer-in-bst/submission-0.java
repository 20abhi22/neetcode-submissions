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
    private PriorityQueue<Integer> queue = new PriorityQueue();
    private void dfs(TreeNode root){
        if(root==null)return ;

         queue.add(root.val);
         dfs(root.left);
         dfs(root.right);


    }
    private int pop(int k){
        while(k>1){
            queue.poll();
            k--;
        }
        return queue.poll();
    }
    public int kthSmallest(TreeNode root, int k) {
        dfs(root);
        return pop(k);
        
    }
}
