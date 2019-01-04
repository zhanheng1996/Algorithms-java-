package algorithms.lintcode;

public class lintcode72 {

    public class TreeNode {
        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    /**
     * @param inorder:   A list of integers that inorder traversal of a tree
     * @param postorder: A list of integers that postorder traversal of a tree
     * @return: Root of a tree
     */
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int len = postorder.length;

        if (len == 0)
            return null;

        int value = postorder[len - 1];
        TreeNode root = new TreeNode(value);
        //找到中序遍历中根节点所在的位置
        int index = 0;
        for (int i = 0; i < len; ++i) {
            if (inorder[i] == value) {
                index = i;
                break;
            }
        }
        //将左子树所有节点用中序和后序遍历
        int[] left_inorder = new int[index];
        int[] left_postorder = new int[index];

        for (int i = 0;  i < index; ++i)
            left_inorder[i] = inorder[i];

        for (int i = 0;  i < index; ++i)
            left_postorder[i] = postorder[i];
        //讲右子树所有节点用中序和后序遍历
        int[] right_inorder = new int[len - index - 1];
        int[] right_postorder = new int[len - index - 1];

        for (int i = index + 1;  i < len; ++i)
            right_inorder[i - index - 1] = inorder[i];

        for (int i = index;  i < len - 1; ++i)
            right_postorder[i - index] = postorder[i];
        //进行递归
        root.left = buildTree(left_inorder, left_postorder);
        root.right = buildTree(right_inorder, right_postorder);
        return root;
    }
}
