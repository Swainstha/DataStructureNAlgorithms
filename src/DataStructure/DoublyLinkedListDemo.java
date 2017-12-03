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


        InsertionSort insertionSort = new InsertionSort(doublyLinkedList);
        System.out.println(insertionSort.insertionSorting());
        //System.out.println(doublyLinkedList);

    }
}
