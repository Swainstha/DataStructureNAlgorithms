package  DataStructure;
public class DoublyLinkedListDemo {
    public static  void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertAtHead(7);
        doublyLinkedList.insertAtHead(9);
        doublyLinkedList.insertAtHead(20);
        doublyLinkedList.insertAtHead(42);
        doublyLinkedList.insertAtHead(64);
        doublyLinkedList.insertAtHead(86);
        doublyLinkedList.insertAtHead(98);

        System.out.println(doublyLinkedList);
        System.out.println("The length is " + doublyLinkedList.length());

    }
}
