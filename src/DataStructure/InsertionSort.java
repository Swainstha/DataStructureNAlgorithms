package  DataStructure;
public class InsertionSort {
    private DoublyLinkedList list;

    public InsertionSort(DoublyLinkedList list) {
        this.list = list;
    }

    public DoublyLinkedList insertionSorting() {
        DoublyLinkedNode current = list.getHead();
        while(current != null) {
            for(DoublyLinkedNode prev=current; prev != null && prev.getPreviousNode() != null; prev = prev.getPreviousNode()) {
                if(prev.getData() < prev.getPreviousNode().getData()) {
                    if (prev == current) {
                        current = prev.getPreviousNode();
                    }
                    swap(prev,prev.getPreviousNode());
                }
            }
            System.out.println(list);
            current = current.getNextNode();
        }
        return list;

    }

    public void swap(DoublyLinkedNode node1, DoublyLinkedNode node2) {
        if (node1 == null || node2 == null) {
            throw new IllegalArgumentException(
                    "The nodes couldn't be null");
        }

        if (node1 == node2) {
            return;
        }

        // make sure node1 is before node2
        if (node1.getPreviousNode() == node2) {
            DoublyLinkedNode temp = node2;
            node2 = node1;
            node1 = temp;
        }

        DoublyLinkedNode node1Prev = node1.getPreviousNode();
        DoublyLinkedNode node1Next = node1.getNextNode();
        DoublyLinkedNode node2Prev = node2.getPreviousNode();
        DoublyLinkedNode node2Next = node2.getNextNode();

        node1.setNextNode(node2Next);
        if (node2Next != null) {
            node2Next.setPreviousNode(node1);
        }

        node2.setPreviousNode(node1Prev);
        if (node1Prev != null) {
            node1Prev.setNextNode(node2);
        }

        if (node1 == node2Prev) {
            node1.setPreviousNode(node2);
            node2.setNextNode(node1);
        } else {
            node1.setPreviousNode(node2Prev);
            if (node2Prev != null) {
                node2Prev.setNextNode(node1);
            }

            node2.setNextNode(node1Next);
            if (node1Next != null) {
                node1Next.setPreviousNode(node2);
            }
        }

        if (node1 == list.getHead()) {
            list.setHead(node2);
        } else if (node2 == list.getHead()) {
            list.setHead(node1);
        }
    }
}
