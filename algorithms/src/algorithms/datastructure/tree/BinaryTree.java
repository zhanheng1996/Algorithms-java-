package algorithms.datastructure.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {
    private BinaryTree<T> lChild;
    private BinaryTree<T> rChild;
    private BinaryTree<T> root;
    private T data;
    private List<BinaryTree> datas;

    public BinaryTree(BinaryTree lChild, BinaryTree rChild, T data) {
        super();
        this.lChild = lChild;
        this.rChild = rChild;
        this.data = data;
    }

    public BinaryTree(T data) {
        this(null, null, data);
    }

    public BinaryTree() {
        super();
    }

    public void createTree(T[] ts) {
        datas = new ArrayList<>();
        for (T t : ts) {
            datas.add(new BinaryTree(t));
        }
        root = datas.get(0);
        for (int i = 0; i < ts.length / 2; i++) {
            if (datas.get(i) != null) {
                if ((int)datas.get(i * 2 + 1).data != 0)
                    datas.get(i).lChild = datas.get(i * 2 + 1);
                else
                    datas.get(i).lChild = null;
                if (i * 2 + 2 < datas.size() && (int)datas.get(i * 2 + 2).data != 0)//避免偶数的时候 下标越界
                    datas.get(i).rChild = datas.get(i * 2 + 2);
                else
                    datas.get(i).rChild = null;
            }
        }
    }

    public void preOrder(BinaryTree<T> root) {
        if (root != null) {
            visit(root.getData());
            preOrder(root.lChild);
            preOrder(root.rChild);
        }
    }

    public void inOrder(BinaryTree<T> root) {
        if (root != null) {
            inOrder(root.lChild);
            visit(root.getData());
            inOrder(root.rChild);
        }
    }

    public void afterOrder(BinaryTree<T> root) {
        if (root != null) {
            afterOrder(root.lChild);
            afterOrder(root.rChild);
            visit(root.getData());
        }
    }

    private void visit(T t) {
        System.out.print(t + " ");
    }

    public T getData() {
        return data;
    }

    public BinaryTree<T> getRoot() {
        return root;
    }
}
