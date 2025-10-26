import java.util.HashMap;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val; }
}

public class CstBinaryTree {
    private int postIndex;
    private int[] postorder;
    private HashMap<Integer, Integer> inorderMap;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.postorder = postorder;
        postIndex = postorder.length - 1;

      
        inorderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return helper(0, inorder.length - 1);
    }

    private TreeNode helper(int inStart, int inEnd) {
        if (inStart > inEnd) return null;

       
        int rootVal = postorder[postIndex--];
        TreeNode root = new TreeNode(rootVal);

       
        int inIndex = inorderMap.get(rootVal);

       
        root.right = helper(inIndex + 1, inEnd);
        root.left = helper(inStart, inIndex - 1);

        return root;
    }
}
