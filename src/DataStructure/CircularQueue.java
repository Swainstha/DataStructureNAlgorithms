package DataStructure;
public class CircularQueue {
    private int max_size = 5;
    private int[] array = new int[max_size];
    private int head = -1;
    private int tail = -1;
    private  int count = 0;

    public void enqueue(int data) {
        if(count >= max_size) {  //count gets incremented on each enqueue operation and gets decremented on each dequeue operation.
            System.out.println("Queue is full");
        } else if(head == -1 && tail == -1) { //initial condition when queue is empty
            head = tail = 0;
            array[tail] = data;
            System.out.println("Enqueue 1 Data:" + array[tail] + " head = " + head + " tail " + tail);
            tail++;
            count++;
        } else if(tail == max_size && ((tail-head) < (max_size - 1)) ) { //condition for tail at the end point but still there are spaces in the front
            tail = 0;
            array[tail] = data;
            System.out.println("Enqueue 3 Data:" + array[tail] + " head = " + head + " tail " + tail);
            tail++;
            count++;
        }
        // first one is a normal condition when head is lesser than tail and tail is not at the end position
        // second one is a condition when head is at the middle and after enqueing the tail has come to the front but there are still spaces in between the head and tail
        //third one is a condition when the head meets the tail after dequeing
        else if((head >= 0 && tail<max_size && tail>head) || (tail < head && (head - tail) < (max_size-1)) || (head == tail)) {
            array[tail] = data;
            System.out.println("Enqueue 4 Data:" + array[tail] + " head = " + head + " tail " + tail);
            tail++;
            count++;
        }
    }

    public int dequeue() {
        if (count == 0) { //when there is no data
            System.out.println("Queue empty");
            return 0;
        } else if(head == max_size -1 && (tail-1)< head){ //when the head is at the far right point and tail has come to the front
            count--;
            head = 0;
            System.out.println("Dequeue 1 Data: " + array[max_size-1] + " head = " + head + " tail " + (tail-1));
            return array[max_size-1];
        } 
        //// first condition is when tail is greater than the head
        // Second condition is when tail has come to the front and head is still greater than tail and in between the endpoints
        else if((head < max_size && (tail-1) > head) || ((tail-1) <= head && head < max_size)){ 
            count--;
            int i = head;
            head++;
            System.out.println("Dequeue 2 Data:" + array[i] + " head = " + head + " tail " + (tail-1));
            return array[i];

        } 
        return 0;
    }

    public int length() {
        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Data: ");
        for (int i = 0; i < max_size; i++) {
            sb.append(array[i]);
            sb.append(" ");
        }

        return sb.toString();
    }
}
