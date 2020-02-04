package pvt.java; //11. заменить все элементы массива на полусумму соседних элементов

import java.util.Arrays;
import java.util.Scanner;

public class Task1_2_11 {

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
        int[] array = new int[size];
        for (int x = 0; x < mass.length; x++) {
            int after_current = 0;
            int before_current = 0;
            if (x > 0) {
                before_current = mass[x - 1];
            }
            if (x < mass.length - 1) {
                after_current = mass[x + 1];
            }
            int middle = (after_current + before_current) / 2;
            array[x] = middle;
        }
        System.out.println(Arrays.toString(array));
    }
}

