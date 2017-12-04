package  DataStructure;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Stack stack = new Stack();
        CircularQueue circularQueue = new CircularQueue();
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while(loop) {
            System.out.println();
            System.out.println("1. Push to stack\n2. Pop from stack\n3. Length of stack\n4. Print elements of stack" +
                    "\n5. Enqueue\n6. Dequeue\n7. Length of circular queue\n8. Print circular queue\n0. quit ");
            System.out.println();
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Enter a number to be pushed");
                    stack.push(scanner.nextInt());
                    break;
                case 2:
                    System.out.println("The popped data is " + stack.pop());
                    break;
                case 3:
                    System.out.println("THe length of stack is " + stack.length());
                    break;
                case 4:
                    System.out.println(stack);
                    break;
                case 5:
                    System.out.println("Enter a number to be enqueued");
                    circularQueue.enqueue(scanner.nextInt());
                    break;
                case 6:
                    System.out.println("The removed data is " + circularQueue.dequeue());
                    break;
                case 7:
                    System.out.println("The length of the queue is " + circularQueue.length());
                    break;
                case 8:
                    System.out.println(circularQueue);
                    break;
                case 0:
                    System.out.println("exiting...");
                    loop = false;
                    break;
                default:
                    System.out.println("Please enter a valid choice");
            }
        }

    }
}
