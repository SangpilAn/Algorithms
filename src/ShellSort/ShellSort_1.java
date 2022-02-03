package ShellSort;

import java.util.Arrays;

public class ShellSort_1 {

    private final static int[] gap =
            {1,4,10,23,57,132,301,701,1750,3937,
            8858,19930,44842,100894,227011,510774,
            1149241,2585792,5818032,13090572,29453787,
            66271020,149109795,335497038,754868335,1698453753};

    public static void shell_sort(int[] a){
        shell_sort(a, a.length);
    }

    private static int getGap(int length){
        int index = 0;

        int len = (int)(length / 2.25);
        while (gap[index] < len){
            index++;
        }
        return index;
    }

    private static void shell_sort(int[] a, int size) {
        int gapIndex = getGap(size);

        while (gapIndex >= 0){
            int step = gap[gapIndex--];

            for (int i = step; i < size; i++) {
                for (int j = i; j >= step && a[j] < a[j - step]; j -= step) {
                    swap(a, j, j - step);
                }
            }
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
