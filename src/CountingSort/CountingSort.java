package CountingSort;

public class CountingSort {
    public static void main(String[] args) {

        int[] array = new int[100];
        int[] counting = new int[31];
        int[] result = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*31);
        }

        for (int j : array) {
            counting[j]++;
        }

        for (int i = 1; i < counting.length; i++) {
            counting[i] += counting[i - 1];
        }

        for (int i = array.length - 1; i >= 0; i--) {
            int value = array[i];
            counting[value]--;
            result[counting[value]] = value;
        }

        System.out.println("array[]");
        for (int i = 0; i < array.length; i++) {
            if(i % 10 == 0) System.out.println();
            System.out.print(array[i] + "\t");
        }
        System.out.println("\n\n");

        System.out.println("counting[]");
        for (int i = 0; i < counting.length; i++) {
            if(i % 10 == 0) System.out.println();
            System.out.print(counting[i] + "\t");
        }
        System.out.println("\n\n");

        System.out.println("result[]");
        for (int i = 0; i < result.length; i++) {
            if(i % 10 == 0) System.out.println();
            System.out.print(result[i] + "\t");
        }
        System.out.println("\n\n");

    }
}
