package algorithms.lintcode;

import java.util.ArrayList;
import java.util.List;

public class SearchRangeinBinarySearchTree {
    /**
     * @param root: param root: The root of the binary search tree
     * @param k1:   An integer
     * @param k2:   An integer
     * @return: return: Return all keys that k1<=key<=k2 in ascending order
     */
    public List<Integer> searchRange(TreeNode root, int k1, int k2) {
        // write your code here
        List<Integer> integers = new ArrayList<>();
        help(integers, root, k1, k2);
        //Collections.sort(integers);排序，不过貌似题目没有要求排序
        return integers;
    }

    static List<Integer> help(List<Integer> list, TreeNode root, int k1, int k2) {
        if (root == null)
            return list;
        if (root.val >= k1 && root.val <= k2) {
            list.add(root.val);
        }
        help(list, root.left, k1, k2);
        help(list, root.right, k1, k2);
        return list;
    }

    public class TreeNode {
        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }
}
