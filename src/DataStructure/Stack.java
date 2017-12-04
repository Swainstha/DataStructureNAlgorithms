package  DataStructure;
public class Stack {
    private int[] array = new int[10];
    private int pointer = -1;

    public void push(int data) {
        array[++pointer] = data;
    }

    public int pop() {
        if(pointer != -1) {
            return array[pointer--];
        }
        System.out.println("The stack is empty");
        return 0;
    }

    public int peek() {
        if(pointer != -1) {
            return array[pointer];
        }
        return 0;
    }

    public int length() {
        return (pointer + 1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("data: ");
        for(int i=0; i <= pointer ;i++) {
            sb.append(array[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
}
