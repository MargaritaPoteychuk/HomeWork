package pvt.java;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        QuickSortClass quickSortClass = new QuickSortClass();

        int[] array = new int[10000];
        System.out.print("Array: ");
        Random Rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = Rand.nextInt(10000);
            System.out.printf("%5d", array[i]);
        }
        System.out.println();
        System.out.println("Not sort");
        System.out.println(Arrays.toString(array));
        int low = 0;
        int high = array.length - 1;

        quickSortClass.quickSort(array, low, high);
        System.out.println("SORTED");
        System.out.println(Arrays.toString(array));
    }


}
