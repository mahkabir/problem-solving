public class MaxDepthOfTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
       int a =  maxDepth(root.left);
       int b = maxDepth(root.right);
        return 1 + Math.max(a, b);
    }

    public static void main(String[] args) {
        MaxDepthOfTree solution = new MaxDepthOfTree();

        // Example tree:
        //      1
        //     / \
        //    2   3
        //   / \
        //  4   5

        TreeNode root = solution.new TreeNode(1);
        root.left = solution.new TreeNode(2);
        root.right = solution.new TreeNode(3);
        root.left.left = solution.new TreeNode(4);
        root.left.right = solution.new TreeNode(5);

        int depth = solution.maxDepth(root);
        System.out.println("Max Depth of the tree: " + depth); // Output should be 3
    }
}
