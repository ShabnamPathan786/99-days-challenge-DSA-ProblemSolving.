// TreeNode class

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

// PathSum class with main method
public class PathSum {

    // Method to check if tree has path sum
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        // Check if it's a leaf node
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        // Reduce target and go deeper
        int remaining = targetSum - root.val;

        // Check either left or right subtree
        return hasPathSum(root.left, remaining)
                || hasPathSum(root.right, remaining);
    }

    // Main method to test
    public static void main(String[] args) {
        /*
                5
               / \
              4   8
             /   / \
            11  13  4
           / \       \
          7   2       1
         */
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        PathSum checker = new PathSum();
        int target = 22;
        boolean result = checker.hasPathSum(root, target);

        System.out.println("Does the tree have a path sum of " + target + "? " + result);
    }
}
