package algorithms.lintcode;

import java.util.ArrayList;
import java.util.List;

public class lintcode480 {

    public class TreeNode {
        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    /**
     * @param root: the root of the binary tree
     * @return: all root-to-leaf paths
     */
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null)
            return result;
        String str = "";
        help(root, result, str);
        return result;
    }

    private void help(TreeNode root, List<String> result, String str) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            str += root.val;
            result.add(str);
            return;
        }
        str += root.val + "->";
        help(root.left, result, str);
        help(root.right, result, str);
    }
}
