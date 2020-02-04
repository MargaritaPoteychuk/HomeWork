package pvt.java; //3. каждый 3-й элемент умножить на 2 (2-мя способами)

import java.util.Arrays;
import java.util.Scanner;

public class Task1_2_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = input.nextInt();
        int[] mass = new int[size];
        int i = 0;
        while (i < size) {
            mass[i] = (int) (Math.random() * 10);
            i++;
        }
        System.out.println("Array elements before multiplication: " + Arrays.toString(mass));
        for (int a = 2; a < size; a += 3) {
            mass[a] *= 2;
        }
        System.out.println("Array elements after multiplication on 2 (1): " + Arrays.toString(mass));

        int z = 2;
        while (z < size) {
            mass[z] *= 2;
            z += 3;
        }
        System.out.println("Array elements after multiplication on 2 (2): " + Arrays.toString(mass));
    }
}
