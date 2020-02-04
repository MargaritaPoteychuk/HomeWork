package pvt.java; //7. пройти по массиву и поменять местами первый и последний,
// второй и предпоследний и т.д.

import java.util.Arrays;
import java.util.Scanner;

public class Task1_2_7 {

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

        for (int j = 0; j < mass.length; j++) {
            int a = mass[j];
            int b = mass[size - 1 - j];
            mass[size - 1 - j] = a;
            mass[j] = b;
            if (j >= (mass.length / 2) - 1) {
                break;
            }
        }
        System.out.println("Array after: " + Arrays.toString(mass));
    }
}

