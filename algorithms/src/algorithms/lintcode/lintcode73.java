package algorithms.lintcode;

public class lintcode73 {

    public class TreeNode {
        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    /**
     * @param inorder:  A list of integers that inorder traversal of a tree
     * @param preorder: A list of integers that postorder traversal of a tree
     * @return: Root of a tree
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int len = preorder.length;
        if (len == 0)
            return null;
        //找到中序遍历根节点的位置
        int val = preorder[0];
        TreeNode root = new TreeNode(val);
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (inorder[i] == val) {
                index = i;
                break;
            }
        }
        //将左子树所有节点用中序和前序遍历
        int[] left_inorder = new int[index];
        int[] left_preorder = new int[index];

        for (int i = 0; i < index; ++i)
            left_inorder[i] = inorder[i];

        for (int i = 1; i < index + 1; ++i)
            left_preorder[i - 1] = preorder[i];
        //讲右子树所有节点用中序和前序遍历
        int[] right_inorder = new int[len - index - 1];
        int[] right_preorder = new int[len - index - 1];

        for (int i = index + 1; i < len; ++i)
            right_inorder[i - index - 1] = inorder[i];

        for (int i = index + 1; i < len; ++i)
            right_preorder[i - index - 1] = preorder[i];
        //进行递归
        root.left = buildTree(left_preorder, left_inorder);
        root.right = buildTree(right_preorder, right_inorder);

        return root;
    }
}
