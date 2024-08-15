package tree;

public class LowestCommonAncester {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */



    public static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int value) {
            this.value = value;
        }

        public TreeNode(int value, TreeNode left, TreeNode right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (p.value > root.value && q.value > root.value)
                return lowestCommonAncestor(root.right, p, q);
            if (p.value < root.value && q.value < root.value)
                return lowestCommonAncestor(root.left, p, q);
            return root;
        }

        public static void main(String[] args) {
            // Construct the binary tree
            TreeNode root = new TreeNode(6);
            root.left = new TreeNode(2);
            root.right = new TreeNode(8);
            root.left.left = new TreeNode(0);
            root.left.right = new TreeNode(4);
            root.left.right.left = new TreeNode(3);
            root.left.right.right = new TreeNode(5);
            root.right.left = new TreeNode(7);
            root.right.right = new TreeNode(9);

            // Define nodes to find the LCA for
            TreeNode p = root.left.right.left;//root.left; // Node with value 2
            TreeNode q = root.left.right.right ;//root.left.right; // Node with value 4

            // Create an instance of Solution
            LowestCommonAncester lowestCommonAncester = new LowestCommonAncester();
            // Find the lowest common ancestor
            TreeNode lca = lowestCommonAncester.lowestCommonAncestor(root, p, q);

            // Print the value of the lowest common ancestor
            System.out.println("Lowest Common Ancestor: " + lca.value);
       }
    }




