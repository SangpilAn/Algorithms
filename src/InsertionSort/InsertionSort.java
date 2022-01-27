package InsertionSort;

public class InsertionSort {

    public static void insertion_sort(int[] a){
        insertion_sort(a, a.length);
    }

    private static void insertion_sort(int[] a, int size) {

        for (int i = 1; i < size; i++) {

            int target = a[i];

            int j = i - 1;

            while (j >= 0 && target < a[j]){
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = target;
        }
    }
}
