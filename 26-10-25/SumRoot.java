class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val; }
}

public class SumRoot {
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int currentNumber) {
        if (node == null) return 0;

        
        currentNumber = currentNumber * 10 + node.val;

        
        if (node.left == null && node.right == null) {
            return currentNumber;
        }

        return dfs(node.left, currentNumber) + dfs(node.right, currentNumber);
    }
}
