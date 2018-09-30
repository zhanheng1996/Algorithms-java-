package algorithms.lintcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeserializeBinaryTree {
    public class TreeNode {
        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    public String serialize(TreeNode root) {
        if (root == null)
            return "{}";
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        String data = "{";
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null)
                data += "#";
            else {
                data += node.val;
                queue.offer(node.left);
                queue.offer(node.right);
            }
            data += ",";
        }
        data += "}";
        return data;
    }

    public TreeNode deserialize(String data) {
        if (data.equals("{}"))
            return null;
        String[] temp = data.trim().substring(1,data.length()-1).split(",");
        ArrayList<TreeNode> queue = new ArrayList<>();
        TreeNode root = new TreeNode(Integer.parseInt(temp[0]));
        queue.add(root);
        int index = 0;
        boolean isLeftChild = true;
        for (int i = 1; i < temp.length; i++) {
            if (!temp[i].equals("#")) {
                TreeNode node = new TreeNode(Integer.parseInt(temp[i]));
                if (isLeftChild)
                    queue.get(index).left = node;
                else
                    queue.get(index).right = node;
                queue.add(node);
            }
            if (!isLeftChild)
                index++;
            isLeftChild = !isLeftChild;
        }
        return root;
    }
}
