package  DataStructure;
public class LinkedListDemo {
    public static  void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtHead(23);
        list.insertAtHead(34);
        list.insertAtHead(43);
        list.insertAtHead(27);
        list.insertAtHead(39);
        list.insertAtHead(12);

        list.deleteHead();

        System.out.println("Found: " + list.find(39));
        System.out.println(list);
        System.out.println(list.length());
    }
}
