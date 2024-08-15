/*
public class ValidateBinarySearchTree98 {
    public class TreeNode {
        int val;
        BinaryTreeLevelOrderTraversal.TreeNode left;
        BinaryTreeLevelOrderTraversal.TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, BinaryTreeLevelOrderTraversal.TreeNode left, BinaryTreeLevelOrderTraversal.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        return dfs(root, null, null);
    }

    private boolean dfs(TreeNode root, Integer min, Integer max) {
        if (root == null) return true;

        if ((min != null && root.val <= min) || max != null && root.val >= max) {
            return false;
        }

        return dfs(root.left, min, root.val) && dfs(root.right, root.val, max);
    }
}
*/
