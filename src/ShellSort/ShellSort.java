package ShellSort;

public class ShellSort {

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

        int len = (int)(length/2.25);
        while (gap[index] < len){
            index++;
        }

        return index;
    }

    private static void shell_sort(int[] a, int size) {
        int index = getGap(size);

        for (int i = index; i >= 0; i--) {
            for (int j = 0; j < gap[i]; j++) {
                insertion_sort(a, j, size, gap[i]);
            }
        }
    }

    /**
     *
     * @param a     배열
     * @param start 부분 배열의 첫 번째 원소 인덱스
     * @param size  배열의 전체 크기
     * @param gap   현재 gap
     */
    private static void insertion_sort(int[] a, int start, int size, int gap) {
        for (int i = start + gap; i < size; i++) {

            int target = a[i];
            int j = i - gap;

            while (j >= start && target < a[j]){
                a[j + gap] = a[j];
                j -= gap;
            }

            a[j + gap] = target;
        }
    }

}
