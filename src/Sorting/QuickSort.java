package Sorting;
public class QuickSort {
    private int[] array = new int[10];

    public int[] quickSorting(int[] data, int low, int high) {
        if(low < high) {
            int end = partition(data, low, high);
            quickSorting(data, low, end-1);
            quickSorting(data, end + 1, high);
        }
        return data;
    }

    public int partition(int[] data, int low, int high) {
        int pivot = data[high];
        int i = low - 1;
        for(int j= low; j < high; j++) {
            if(data[j] < pivot) {
                i++;
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        if(data[high] < data[i+1]) {
            int temp = data[i+1];
            data[i+1] = data[high];
            data[high] = temp;
        }
        return i+1;
    }
}