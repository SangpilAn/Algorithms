package BubbleSort;

import java.util.Arrays;

public class BubbleSort_1 {

    public static void bubble_sort(int[] a){
        bubble_sort(a, a.length);
    }

    private static void bubble_sort(int[] a, int size) {

        for (int i = 1; i < size; i++) {

            boolean swapped = false;

            for (int j = 0; j < size - i; j++) {

                if(a[j] > a[j + 1]){
                    swap(a, j, j + 1);
                    swapped = true;
                }

            }

            if(!swapped){
                break;
            }
        }

    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
