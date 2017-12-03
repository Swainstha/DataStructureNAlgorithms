package Sorting;
public class MergeSort {
    private int[] array = new int[10];

    public int[] mergeSort(int[] data) {
        int len = data.length;
        //System.out.println(len);
        if(len == 1){
            return data;
        } else {
            int mid = len/2;
            int n1 = mid;
            int n2 = len - mid;
            int[] part1 = new int[n1];
            int[] part2 = new int[n2];
            for(int i = 0;i < n1; i++) {
                part1[i] = data[i];
            }
            for(int i = 0;i < n2; i++) {
                part2[i] = data[mid + i];
            }
            part1 = mergeSort(part1);
            part2 = mergeSort(part2);
            data = merge(part1,part2);
        }
        return data;
    }

    public int[] merge(int[] data1, int[] data2) {
        int[] data = new int[data1.length + data2.length];
        int i=0;
        int j=0;
        for(int k=0; k < (data1.length + data2.length); k++) {
            if(i < data1.length && j < data2.length) {
                if (data1[i] < data2[j]) {
                    data[k] = data1[i];
                    i++;
                } else {
                    data[k] = data2[j];
                    j++;
                }
            } else if(i < data1.length) {
                data[k] = data1[i];
                i++;
            } else if(j < data2.length) {
                data[k] = data2[j];
                j++;
            }
        }
        return data;
    }
}