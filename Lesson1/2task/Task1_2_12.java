package pvt.java; //12.циклически сдвинуть все элементы вправо на 2 позиции
// (1-й элемент станет 3-м, 2-й стент 4-м и т.д.)

import java.util.Arrays;
import java.util.Scanner;

public class Task1_2_12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array elements: ");
        int size = input.nextInt();
        int[] mass = new int[size];
        int i = 0;
        while (i < size) {
            mass[i] = (int) (Math.random() * 100);
            i++;
        }
        System.out.println("Array elements: " + Arrays.toString(mass));
        int[] array = new int[size];
        for (int x = 0; x < mass.length - 2; x++) {
            int a = mass[x];
            array[x + 2] = a;
        }
        int b = mass[mass.length - 2];
        array[0] = b;
        int c = mass[mass.length - 1];
        array[1] = c;
        System.out.println(Arrays.toString(array));
    }
}

