package Sorting;
import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

    private int[] array;

    public BubbleSort(int[] array) {
        this.array = array;
    }

    public int[] bubbleSorting() {

        int[] list = this.array;
        for(int i = 0; i < list.length - 2; i++) {
            for(int j = 0; j < list.length-1-i; j++){
                if(list[j] > list[j+1]) {
                    int temp = list[j + 1];
                    list[j + 1] = list[j];
                    list[j] = temp;
                }
            }
        }
        return list;
    }


}
