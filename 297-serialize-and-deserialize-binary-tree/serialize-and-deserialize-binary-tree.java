/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    int index=0;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        helper(root,sb);
        return sb.toString();
    }
    void helper(TreeNode root,StringBuilder sb){
        if(root==null){
            sb.append("null,").toString();
            return;
        }
        sb.append(root.val).append(",");
        helper(root.left,sb);
        helper(root.right,sb);
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String arr[]=data.split(",");
        index=0;
        return build(arr);
    }
    TreeNode build(String[] arr){
        if(arr[index].equals("null")){
            index++;
            return null;
        }
        int val=Integer.parseInt(arr[index++]);
        TreeNode root=new TreeNode(val);
        root.left=build(arr);
        root.right=build(arr);
        return root;
    }

}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));