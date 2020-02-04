package pvt.java; //9. найти номер минимального-максимального элементов и вывести

import java.util.Arrays;
import java.util.Scanner;

public class Task1_2_9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = input.nextInt();
        int[] mass = new int[size];
        int i = 0;
        while (i < size) {
            mass[i] = (int) (Math.random() * 100);
            i++;
        }
        System.out.println("Array elements: " + Arrays.toString(mass));
        int max_number = 0;
        int min_number = 0;
        for (int x = 0; x < mass.length; x++) {
            if (mass[x]> mass[max_number]) {
                max_number = x;
            }
            if (mass[x] < mass[min_number]) {
                min_number = x;
            }
        }
        System.out.println("Index of max element: " + max_number);
        System.out.println("Index of min element: " + min_number);
    }
}

