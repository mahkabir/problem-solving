package tree;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElementInBST230 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list.get(k - 1);
    }

    private void inorder(TreeNode root, List<Integer> list) {
        if (root == null) return;

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    public int practiceKthSmallestinBst(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        practiceInorder(root,list);
        return list.get(k-1);
    }

    private void practiceInorder(TreeNode root, List<Integer> list) {
       if(root == null) return;
       practiceInorder(root.left,list) ;
       list.add(root.val);
       practiceInorder(root.right,list);
    }

}
