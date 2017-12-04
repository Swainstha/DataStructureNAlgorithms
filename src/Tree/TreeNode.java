package Tree;

public class TreeNode {

    private Integer data;
    private TreeNode leftChild;
    private TreeNode rightChild;
    private boolean isDeleted = false;

    public TreeNode(Integer data) {
        this.data = data;
    }

    //finding the required node by recursively going into the left and right nodes of a node until it reaches the leaf node or until the required node is found.
    public TreeNode find(Integer data) {
        if(this.data == data && !this.isDeleted()) {
            System.out.println("Data found");
            return this;
        } else if(this.data > data && leftChild != null) {
            return leftChild.find(data);
        } else if(rightChild != null) {
            return rightChild.find(data);
        }
        System.out.println("Could not find the data");
        return null;
    }

    //Inserting a given data by comparing with the data of the nodes and selecting the right node or left node accordingly and then recusively inserting the data.
    public void insert(Integer data) {
        if(data > this.data ) {
            if(this.rightChild == null) {
                this.rightChild = new TreeNode(data);
            } else {
                this.rightChild.insert(data);
            }
        } else if(data < this.data){
            if(leftChild == null) {
                this.leftChild = new TreeNode(data);
            } else {
                leftChild.insert(data);
            }
        }
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public Integer getData() {
        return data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void delete() {
        this.isDeleted = true;
    }

    public boolean isDeleted() {
        return this.isDeleted;
    }
    @Override
    public String toString() {
        return data + " ";
    }
}
