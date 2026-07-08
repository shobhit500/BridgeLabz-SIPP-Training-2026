package Sorting;

import java.util.Scanner;

public class StudentMarks {

    public static void bubbleSort(int arr[]) {

        int n = arr.length;
        int swaps = 0;
        boolean sorted;

        for (int i = 0; i < n - 1; i++) {

            sorted = true;

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swaps++;
                    sorted = false;
                }
            }

            if (sorted) {
                System.out.println("Array is already sorted.");
                break;
            }
        }

        System.out.println("Total Swaps = " + swaps);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int marks[] = new int[n];

        System.out.println("Enter marks:");

        for (int i = 0; i < n; i++)
            marks[i] = sc.nextInt();

        bubbleSort(marks);

        System.out.println("Sorted Marks:");

        for (int x : marks)
            System.out.print(x + " ");
    }
}