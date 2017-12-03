package  DataStructure;
public class DoublyLinkedList {

    private DoublyLinkedNode head;

    public DoublyLinkedNode getHead() {
        return head;
    }

    public void setHead(DoublyLinkedNode head) {
        this.head = head;
    }

    public void insertAtHead(int data) {
        DoublyLinkedNode newNode = new DoublyLinkedNode(data);
        newNode.setNextNode(this.head);
        if(this.head != null) {
            this.head.setPreviousNode(newNode);
        }
        this.head = newNode;
    }

    public int length() {
        if(this.head == null) {
            return 0;
        }
        int length = 0;
        DoublyLinkedNode current = this.head;
        while(current != null) {
            length++ ;
            current = current.getNextNode();
        }
        return length;
    }

    @Override
    public String toString() {
        String result = "{";
        DoublyLinkedNode current = this.head;
        while(current != null) {
            result += current.toString() + " ";
            current = current.getNextNode();
        }
        return result + "}";
    }
}
