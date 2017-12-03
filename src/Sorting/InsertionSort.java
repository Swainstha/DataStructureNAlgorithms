package Sorting;
public class InsertionSort {
    private int[] array;
    private Employee[] e;
    public InsertionSort(int[] array) {
        this.array = array;
    }

    public InsertionSort(Employee[] e) {
        this.e = e;
    }

    public int[] insertionSortingInteger() {
        int[] list = new int[array.length];
        int current;
        for(int i = 0; i < array.length; i++){
            current = list[i] = array[i];
            for(int j = i-1; j >= 0; j--){
                if(current < list[j]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j+1] = temp;
                }
            }
        }
        return list;
    }

    public Employee[] insertionSortingObject() {

        Employee[] list = new Employee[e.length];
        Employee currentEmp;
        for(int i = 0; i < e.length; i++){
            currentEmp = list[i] = e[i];
            for(int j = i-1; j >= 0; j--){
                if(currentEmp.getEmployeeNumber() < list[j].getEmployeeNumber()) {
                    Employee temp = list[j];
                    list[j] = list[j + 1];
                    list[j+1] = temp;
                }
            }
        }
        return list;
    }
}
