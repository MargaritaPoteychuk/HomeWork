package pvt.java; //2. найти произведения всех элементов массива, вывести

import java.util.Arrays;
import java.util.Scanner;

public class Task1_2_2 {

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
        System.out.println("Array: " + Arrays.toString(mass));
        System.out.println("Elements composition: ");
        int pr = 1;
        for (int a = 0; a < size; a++) {
            pr *= mass[a];
        }
        System.out.println(pr);
    }
}
