class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if (p == null && q == null) return true;

        
        if (p == null || q == null || p.val != q.val) return false;

        
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        SameTree obj = new SameTree();
        System.out.println(obj.isSameTree(p, q)); // Output: true

        
        TreeNode r = new TreeNode(1);
        r.left = new TreeNode(2);

        TreeNode s = new TreeNode(1);
        s.right = new TreeNode(2);

        System.out.println(obj.isSameTree(r, s)); // Output: false
    }
}
