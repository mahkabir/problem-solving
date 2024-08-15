public class InvertBinaryTree226 {
    public class TreeNode {
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

   /* public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }*/
   public TreeNode invertTree(TreeNode root) {
       if (root == null) {
           return null;
       }

       TreeNode left = invertTree(root.left);
       TreeNode right = invertTree(root.right);

       root.left = right;
       root.right = left;

       return root;
   }

      /* public TreeNode invertTree(TreeNode root) {
           if (root == null) return null;
           TreeNode node = new TreeNode(root.value);
           node.right = invertTree(root.left);
           node.left = invertTree(root.right);
           return node;
       }*/

    public static void main(String[] args) {
        InvertBinaryTree226 invertBinaryTree226 = new InvertBinaryTree226();
        TreeNode root = invertBinaryTree226.new TreeNode(4);
        root.left = invertBinaryTree226.new TreeNode(2);
        root.right = invertBinaryTree226.new TreeNode(7);
        root.left.left = invertBinaryTree226.new TreeNode(1);
        root.left.right = invertBinaryTree226.new TreeNode(3);
        root.right.left = invertBinaryTree226.new TreeNode(6);
        root.right.right = invertBinaryTree226.new TreeNode(9);


        System.out.print("Original Tree: ");
        printTree(root);

        TreeNode invertedRoot = invertBinaryTree226.invertTree(root);

        System.out.print("Inverted Tree: ");
        printTree(invertedRoot);
    }

    public static void printTree(TreeNode root) {
        if (root == null) return;
        System.out.print(root.value + " ");
        printTree(root.left);
        printTree(root.right);
    }
}
