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

    //soft delete. The node is there but it cant br found is searched
    public void deleteSoft(Integer data) {
        TreeNode node = this.find(data);
        node.delete();
    }

    //hard delete. Deleting the node itself and re-arranging the tree after the node has been deleted
    public void delete(Integer data) {
        TreeNode current = this.root;
        TreeNode parent = this.root;
        boolean isLeftChild = false;

        if(current == null)
            return;

        // finding the node to be deleted
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
        if(current == null) {
            System.out.println("Not found");
            return;
        }

        // if the node to be deleted is a leaf node
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
        } else if(current.getRightChild() == null) { //if the node to be deleted contains only a left node and that left node is a leaf node
            if(current == root)
                root = current.getLeftChild();
            else if(isLeftChild)
                parent.setLeftChild(current.getLeftChild());
            else
                parent.setRightChild(current.getLeftChild());
        } else if(current.getLeftChild() == null) {     //if the node to be deleted contains only a right node and that right node is a leaf node
            if(current == root)
                root = current.getRightChild();
            else if(isLeftChild)
                parent.setLeftChild(current.getRightChild());
            else
                parent.setRightChild(current.getRightChild());
        } else {                                        //if the node to be deleted is in the middle of the tree
            TreeNode node = current.getRightChild();
            System.out.println(node);
            TreeNode prevNode = new TreeNode(0);
            if(node.getLeftChild() == null && node.getRightChild() == null) {   //if the right node of the deleted node is a leaf node
                node.setLeftChild(current.getLeftChild());
                if(isLeftChild)
                    parent.setLeftChild(node);
                else
                    parent.setRightChild(node);
            }
            else if(node.getLeftChild() != null) { //if the right node of the deleted node is not a leaf node
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
            } else if(node.getLeftChild() == null && parent != null){ //if the deleted node is not a root node and the left child of the deleted node is null
                node.setLeftChild(current.getLeftChild());
                if(isLeftChild)
                    parent.setLeftChild(node);
                else
                    parent.setRightChild(node);
            } else if(node.getLeftChild() == null && parent == null) { //if the deleted node is a root node
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
