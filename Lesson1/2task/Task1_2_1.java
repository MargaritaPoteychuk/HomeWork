package pvt.java; //1. пройти по массиву, вывести все элементы в прямом и в обратном порядке.

import java.util.Arrays;
import java.util.Scanner;

public class Task1_2_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = input.nextInt();
        int[] mass = new int[size];
        for (int i = 0; i < mass.length; i++) {
            System.out.println("Enter array element: ");
            mass[i] = input.nextInt();
        }
        System.out.println("Array: " + Arrays.toString(mass));
        System.out.println("Elements in order: ");
        for (int a = 0; a < size; a++) {
            System.out.print(mass[a] + " ");
        }
        System.out.println();
        System.out.println("Elements in reverse order: ");
        for (int a = size - 1; a >= 0; a--) {
            System.out.print(mass[a] + " ");
        }

    }
}
