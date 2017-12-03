package Tree;

public class BinarySearchTree {

    private TreeNode root;

    public BinarySearchTree(Integer data) {
        this.root = new TreeNode(data);
    }

    public void insert(Integer data) {
        if(root == null) {
            this.root = new TreeNode(data);
        } else {
            root.insert(data);
        }
    }

    public TreeNode find(Integer data) {
        if(root != null) {
            return root.find(data);
        }
        return null;
    }

    public void deleteSoft(Integer data) {
        TreeNode node = this.find(data);
        node.delete();
    }

    public void delete(Integer data) {
        TreeNode current = this.root;
        TreeNode parent = this.root;
        boolean isLeftChild = false;

        if(current == null)
            return;

        while(current != null && current.getData() != data) {
            parent = current;
            if(data < current.getData()) {
                current = current.getLeftChild();
                isLeftChild = true;
            } else {
                current = current.getRightChild();
                isLeftChild = false;
            }
        }

        if(current.getLeftChild() == null && current.getRightChild() == null) {
            if (current == null) {
                return;
            } else {
                if (isLeftChild) {
                    parent.setLeftChild(null);
                } else {
                    parent.setRightChild(null);
                }
            }
        } else if(current.getRightChild() == null) {
            if(current == root)
                root = current.getLeftChild();
            else if(isLeftChild)
                parent.setLeftChild(current.getLeftChild());
            else
                parent.setRightChild(current.getLeftChild());
        } else if(current.getLeftChild() == null) {
            if(current == root)
                root = current.getRightChild();
            else if(isLeftChild)
                parent.setLeftChild(current.getRightChild());
            else
                parent.setRightChild(current.getRightChild());
        } else {
            TreeNode node = current.getRightChild();
            System.out.println(node);
            TreeNode prevNode = new TreeNode(0);
            if(node.getLeftChild() == null && node.getRightChild() == null) {
                node.setLeftChild(current.getLeftChild());
                if(isLeftChild)
                    parent.setLeftChild(node);
                else
                    parent.setRightChild(node);
            }
            else if(node.getLeftChild() != null) {
                while (node.getLeftChild() != null) {
                    prevNode = node;
                    node = node.getLeftChild();
                }
                if(current == root){
                    root = node;
                } else if (isLeftChild) {
                    parent.setLeftChild(node);
                } else {
                    parent.setRightChild(node);
                }

                if (node.getRightChild() == null) {
                    node.setLeftChild(current.getLeftChild());
                    node.setRightChild(current.getRightChild());
                    prevNode.setLeftChild(null);
                } else {
                    prevNode.setLeftChild(node.getRightChild());
                    node.setLeftChild(current.getLeftChild());
                    node.setRightChild(current.getRightChild());
                }
                if(current == root)
                    root = node;
            } else if(node.getLeftChild() == null && parent != null){
                node.setLeftChild(current.getLeftChild());
                if(isLeftChild)
                    parent.setLeftChild(node);
                else
                    parent.setRightChild(node);
            } else if(node.getLeftChild() == null && parent == null) {
                node.setLeftChild(current.getLeftChild());
                root = node;
            }
        }
    }

    @Override
    public String toString() {
        return print(root);
    }

    public String print(TreeNode node) {
        if(node == null)
            return " ";
        else
            return print(node.getLeftChild()) + node + print(node.getRightChild());
    }
}