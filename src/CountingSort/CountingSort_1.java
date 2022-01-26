package CountingSort;

public class CountingSort_1 {
    public static void main(String[] args) {

        int[] arr = new int[101];

        for (int i = 0; i < 50; i++) {
            arr[(int) (Math.random() * 101)]++;
        }

        for (int i = 0; i < arr.length; i++) {
            while (arr[i]-- > 0){
                System.out.print(i + " ");
            }
        }

    }
}
