package Sorting;
import java.util.Random;

public class App {
    public static void main(String[] args) {

        /**Generating random numbers and implementing bubble sort, selection sort and insertion sort */
        /*Random rand = new Random();
        final int len = 1000;
        int[] list = new int[len];

        for(int i = 0; i<len; i++) {

            list[i] = rand.nextInt(1000) + 1;
            //System.out.println(list[i]);
        }

        System.out.println("\n\n");*/

        //BubbleSort bubbleSort = new BubbleSort(list);
        //list = bubbleSort.bubbleSorting();

        //SelectionSort selectionSort = new SelectionSort(list);
        //list = selectionSort.selectionSorting();

        //InsertionSort insertionSort = new InsertionSort(list);
        //list = insertionSort.insertionSortingInteger();

        //MergeSort mergeSort = new MergeSort();
        //list = mergeSort.mergeSort(list);

        //QuickSort quickSort = new QuickSort();
        //list = quickSort.quickSorting(list, 0, list.length);

        //ShellSort shellSort = new ShellSort();
        //list = shellSort.shellSorting(list);

        /* for(int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }*/

        /**********************************************************************************************/

        /**Data Structures Section 3 Assigment 1. Use insertion sort to sort the employees based on their employeeNumber */
        /*Employee emp1 = new Employee(23,"Swain","Shrestha", "swainstha@outlook.com");
        Employee emp2 = new Employee(12,"Sushil","Khadka", "punk.khadka@gmail.com");
        Employee emp3 = new Employee(37,"Sajan","Amatya", "saj10@gmail.com");
        Employee emp4 = new Employee(5,"Shovan Raj","Shrestha", "gaida@outlook.com");
        Employee emp5 = new Employee(21,"Nickel","Rai", "nickelrai@gmail.com");

        Employee[] emp= {emp1,emp2,emp3,emp4,emp5};
        InsertionSort insertionSort = new InsertionSort(emp);
        emp = insertionSort.insertionSortingObject();

        for(int i = 0; i < emp.length; i++) {
            System.out.println(emp[i]);
        }*/
        /******************************************************************************************/

        /** Data Structures Section 3 Assigment 2. Implement an algorithm to Check Duplicates in a string */

        /*CheckStrings checkDuplicate = new CheckStrings();
        boolean duplicate = checkDuplicate.hasDuplicateChars("Strings");
        System.out.println(duplicate);*/

        /** Data Structures Section 3 Assignment 3.Check for anagram */
        CheckStrings checkAnagram = new CheckStrings();
        boolean anagram = checkAnagram.isAnagram("sushil","shusil");
        System.out.println(anagram);

        /******************************************************************************************/



    }
}
