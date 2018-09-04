package algorithms.sorting.datastructure.tree;

public class TestTree {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        Integer[] numbers = {1, 0, 2, 0, 0, 3, 4};
        binaryTree.createTree(numbers);
        //前序遍历
        binaryTree.preOrder(binaryTree.getRoot());
        //中序遍历
        System.out.println();
        binaryTree.inOrder(binaryTree.getRoot());
        //后序遍历
        System.out.println();
        binaryTree.afterOrder(binaryTree.getRoot());
    }
}
