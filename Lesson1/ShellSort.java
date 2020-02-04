package pvt.java;

import java.util.Random;

public class ShellSort {
    public static void main(String[] args) {
        int[] matrix = new int[10000];
        System.out.print("Array: ");
        Random Rand = new Random();
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Rand.nextInt(10000);
            System.out.printf("%5d", matrix[i]);
        }
        int d = 10000;
        d = d / 2;
        while (d > 0) {
            for (int i = 1; i < 10000 - d; i++) {
                int j = i;
                while (j > 0 && matrix[j] > matrix[j + d]) {
                    int ch = matrix[j];
                    matrix[j] = matrix[j + d];
                    matrix[j + d] = ch;
                    j--;
                }
            }
            d = d / 2;
        }
        System.out.println();
        for (int i = 1; i < matrix.length; i++) {
            System.out.print(matrix[i] + " ");
        }
    }
}
