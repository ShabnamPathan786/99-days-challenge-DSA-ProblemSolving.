 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val; }
}

class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    
    public void printPreorder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    public static void main(String[] args) {
        InvertTree tree = new InvertTree();

       
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        System.out.println("Before invert:");
        tree.printPreorder(root);  
        System.out.println();

        tree.invertTree(root);

        System.out.println("After invert:");
        tree.printPreorder(root); 
    }
}

/*
 Time Complexity: O(n)
 Space Complexity: O(h)
*/
