package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
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
    /*public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null) return res;

        queue.add(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                TreeNode curr = queue.poll();
                level.add(curr.val);
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
            res.add(level);
        }
        return res;
    }*/
    public List<List<Integer>> levelOrderTraversal(TreeNode root){

        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queuelist = new LinkedList<>();
        queuelist.add(root);
        while(!queuelist.isEmpty()){

            int size = queuelist.size();
            List<Integer> num = new ArrayList<>();
            for(int i =0;i<size;i++){
                TreeNode current = queuelist.poll();
                num.add(current.val);
                if(current.left!=null){
                    queuelist.add(current.left);
                }
                if(current.right!=null){
                    queuelist.add(current.right);
                }
            }
            res.add(num);
        }
        return res;
    }

}
