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

public class Codec {

    private int index =0;
    private void shelper(TreeNode root,StringBuilder res){
        if(root == null){
            res.append("N,");
            return ;
        }
        res.append(root.val).append(",");
        shelper(root.left,res);
        shelper(root.right,res);    
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder res = new StringBuilder();
        shelper(root,res);

        return res.toString();
        
    }

    private TreeNode dhelper(String[] datas){
        String value = datas[index++];
        if(value.equals("N")) return null;

        TreeNode root = new TreeNode(Integer.parseInt(value));

        root.left=dhelper(datas);
        root.right=dhelper(datas);

        return root;

        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        // TreeNode root=new Treenode();
        String[] datas= data.split(",");
        // dhelper(root, datas);
        return dhelper(datas);
    }
}
