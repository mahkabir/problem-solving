/*
import java.util.Arrays;

public class InvertBinaryTree {

     //Definition for a binary tree node.
      public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
          TreeNode() {}
         TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }

         public TreeNode invertTree(TreeNode root) {
             if (root == null) return null;
             TreeNode node = new TreeNode(root.val);
             node.right = invertTree(root.left);
             node.left = invertTree(root.right);
             return node;
         }
      }


    public static void main(String[] args) {
       TreeNode node = new TreeNode(4);
        int[] a = {4,2,7,1,3,6,9};
        int [] result = node.invertTree();
        System.out.println("output: " + Arrays.toString(result));
    }
}
*/

//=================contains duplicate=========
/*

class Solution {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (uniques.contains(nums[i])) {
                return true;
            }
            uniques.add(nums[i]);
        }
        return false;
    }
}

*/
//===========valid anagram 242=================
//
// class Solution {
//
//    public boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) return false;
//
//        int[] store = new int[26];
//
//        for (int i = 0; i < s.length(); i++) {
//            store[s.charAt(i) - 'a']++;
//            store[t.charAt(i) - 'a']--;
//        }
//
//        for (int n : store) if (n != 0) return false;
//
//        return true;
//    }
//}
// =========== 1. two sum================
//
// class Solution {
//
//    public int[] twoSum(int[] nums, int target) {
//        HashMap<Integer, Integer> prevMap = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            int num = nums[i];
//            int diff = target - num;
//
//            if (prevMap.containsKey(diff)) {
//                return new int[] { prevMap.get(diff), i };
//            }
//
//            prevMap.put(num, i);
//        }
//
//        return new int[] {};
//    }
//}

//===========

