package Sorting;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {

        /**Generating random numbers and implementing bubble sort, selection sort and insertion sort */
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        final int len = 1000;
        int[] list = new int[len];
        boolean loop = true;

        for(int i = 0; i<len; i++) {

            list[i] = rand.nextInt(1000) + 1;
        }

        while(loop) {

            System.out.println("Select your task");
            System.out.println("1. Bubble Sort\n2. Selection Sort\n3. Insertion Sort" +
                    "\n4. Merge Sort\n5. Quick Sort\n6. Shell Sort\n7. Sort Employees\n" +
                    "8. CheckDuplicates\n9. Check Anagram");

            int input = scanner.nextInt();
            scanner.nextLine();
            Date date1 = new Date();
            switch (input) {
                case 1:
                    BubbleSort bubbleSort = new BubbleSort(list);
                    list = bubbleSort.bubbleSorting();
                    break;
                case 2:
                    SelectionSort selectionSort = new SelectionSort(list);
                    list = selectionSort.selectionSorting();
                    break;
                case 3:
                    InsertionSort insertionSort = new InsertionSort(list);
                    list = insertionSort.insertionSortingInteger();
                    break;
                case 4:
                    MergeSort mergeSort = new MergeSort();
                    list = mergeSort.mergeSort(list);
                    break;
                case 5:
                    QuickSort quickSort = new QuickSort();
                    list = quickSort.quickSorting(list, 0, list.length-1);
                    break;
                case 6:
                    ShellSort shellSort = new ShellSort();
                    shellSort.shellSorting(list);
                    break;
                case 7:
                    sortEmployees();
                    break;
                case 8:
                    System.out.println("Enter the string in which you want to check for duplicates");
                    String data = scanner.nextLine();
                    checkDuplicate(data);
                    break;
                case 9:
                    System.out.println("Enter the two strings to check if they are anagrams");
                    String data1 = scanner.nextLine();
                    String data2 = scanner.nextLine();
                    checkForAnagram(data1, data2);
                    break;
                case 0:
                    loop = false;
                    break;
                default:
                    System.out.println("Please choose a valid number");
            }
            Date date2 = new Date();
            switch (input) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    long diffMillis = date2.getTime() - date1.getTime();
                    System.out.println("The time taken in microseconds is: " + (diffMillis*1000));
                    for (int i = 0; i < list.length; i++) {
                        System.out.print(list[i] + " ");
                    }
                    System.out.println();
                }
            }
        }

    /**Data Structures Section 3 Assigment 1. Use insertion sort to sort the employees based on their employeeNumber */
    public static void sortEmployees() {

        Employee emp1 = new Employee(23,"Swain","Shrestha", "swainstha@outlook.com");
        Employee emp2 = new Employee(12,"Sushil","Khadka", "punk.khadka@gmail.com");
        Employee emp3 = new Employee(37,"Sajan","Amatya", "saj10@gmail.com");
        Employee emp4 = new Employee(5,"Shovan Raj","Shrestha", "gaida@outlook.com");
        Employee emp5 = new Employee(21,"Nickel","Rai", "nickelrai@gmail.com");

        Employee[] emp= {emp1,emp2,emp3,emp4,emp5};
        InsertionSort insertionSort = new InsertionSort(emp);
        emp = insertionSort.insertionSortingObject();

        for(int i = 0; i < emp.length; i++) {
            System.out.println(emp[i]);
        }
    }

    /** Data Structures Section 3 Assigment 2. Implement an algorithm to Check Duplicates in a string */
    public static void checkDuplicate(String data) {
        CheckStrings checkDuplicate = new CheckStrings();
        boolean duplicate = checkDuplicate.hasDuplicateChars("Strings");
        if(duplicate)
            System.out.println("The string has duplicate characters");
        else
            System.out.println("The string does not have duplicate characters");
    }

    /** Data Structures Section 3 Assignment 3.Check for anagram */
    public static void checkForAnagram(String data1, String data2) {
        CheckStrings checkAnagram = new CheckStrings();
        boolean anagram = checkAnagram.isAnagram(data1, data2);
        if(anagram)
            System.out.println("The two strings are anagrams");
        else
            System.out.println("The two strings are not anagrams");
    }
}
