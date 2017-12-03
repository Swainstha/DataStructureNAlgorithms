package Tree;

public class App {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree(10);
        tree.insert(5);
        tree.insert(8);
        tree.insert(9);
        tree.insert(3);
        tree.insert(4);
        tree.insert(2);
        tree.insert(15);
        tree.insert(13);
        tree.insert(17);
        tree.insert(12);
        tree.insert(19);
        tree.insert(14);
        tree.insert(20);
        tree.insert(11);
        tree.deleteSoft(10);
        tree.deleteSoft(15);
        System.out.println(tree.find(15));
    }
}