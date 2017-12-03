package Sorting;
public class SelectionSort {
    private int[] array;

    public SelectionSort(int[] array) {
        this.array = array;
    }

    public int[] selectionSorting() {
        int[] list = this.array;
        for(int i = 0; i< list.length-2; i++) {
            int minIndex = i;
            for(int j = i; j< list.length -1; j++) {
                if(list[j] < list[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;
        }
        return list;
    }
}
