package Tree;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree(10);
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("1. Insert 2.Delete 3. Find 4. Print All 0. quit");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Enter the number you want to add to the tree");
                    tree.insert(scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Enter the number you want to delete.");
                    tree.delete(scanner.nextInt());
                    break;
                case 3:
                    System.out.println("Enter the number you want to find");
                    tree.find(scanner.nextInt());
                    break;
                case 4:
                    System.out.println(tree);
                    break;
                case 0:
                    loop = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Please  enter  valid choice");
                    break;
            }

        }
    }
}