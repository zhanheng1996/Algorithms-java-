package algorithms.lintcode;

public class lintcode1759 {

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
     * @return: the number of nodes
     */
    int count = 0;
    public int getAns(TreeNode root) {
        help(root);
        return count;
    }

    private void help(TreeNode root) {
        if (root == null)
            return;
        count++;
        help(root.left);
        help(root.right);
    }
}
