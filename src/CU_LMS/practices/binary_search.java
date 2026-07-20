package CU_LMS.practices;

import java.util.Scanner;

public class binary_search {
    static void binarysearch(int arr[], int size, int key) {
        int low = 0;
        int high = size;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("Element found at index " + mid);
                return;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Element not found.");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the size:- ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter " + size + " Elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.printf("Enter the element to search : ");
        int key = sc.nextInt();

        binarysearch(arr, size, key);
    }
}