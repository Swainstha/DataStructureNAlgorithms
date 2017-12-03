package DataStructure;
public class CircularQueue {
    private int max_size = 5;
    private int[] array = new int[max_size];
    private int head = -1;
    private int tail = -1;
    private  int count = 0;

    public void enqueue(int data) {
        if(count >= max_size) {
            System.out.println("Queue is full");
        } else if(head == -1 && tail == -1) {
            head = tail = 0;
            array[tail] = data;
            System.out.println("Enqueue 1 Data:" + array[tail] + " head = " + head + " tail " + tail);
            tail++;
            count++;
        } else if(tail == max_size && ((tail-head) < (max_size - 1)) ) {
            tail = 0;
            array[tail] = data;
            System.out.println("Enqueue 3 Data:" + array[tail] + " head = " + head + " tail " + tail);
            tail++;
            count++;
        } else if(head >= 0 && tail<max_size && tail>head) {
            array[tail] = data;
            System.out.println("Enqueue 4 Data:" + array[tail] + " head = " + head + " tail " + tail);
            tail++;
            count++;
        } else if(tail < head && (head - tail) < (max_size-1)) {
            array[tail] = data;
            System.out.println("Enqueue 5 Data:" + array[tail] + " head = " + head + " tail " + tail);
            tail++;
            count++;
        } else if(head == tail) {
            System.out.println("Enqueue 2 Data:" + array[tail] + " head = " + head + " tail " + tail);
            array[tail] = data;
            tail++;
            count++;
        }
    }

    public int dequeue() {
        if (count == 0) {
            System.out.println("Queue empty");
            return 0;
        } else if(head == max_size -1 && (tail-1)< head){
            count--;
            head = 0;
            System.out.println("Dequeue 1 Data: " + array[max_size-1] + " head = " + head + " tail " + (tail-1));
            return array[max_size-1];
        } else if(head < max_size && (tail-1) > head){
            count--;
            int i = head;
            head++;
            System.out.println("Dequeue 2 Data:" + array[i] + " head = " + head + " tail " + (tail-1));
            return array[i];

        } else if((tail-1) <= head && head < max_size) {
            count--;
            int i = head;
            head++;
            System.out.println("Dequeue 3 Data: " + array[i] + " head = " + head + " tail " + (tail-1));
            return  array[i];
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
