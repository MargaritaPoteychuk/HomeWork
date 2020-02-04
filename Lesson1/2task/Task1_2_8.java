package pvt.java; //8. найти минимальный-максимальный элементы и вывести

import java.util.Arrays;
import java.util.Scanner;

public class Task1_2_8 {

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
        int min_number = 99;
        for (int a : mass) {
            if (a > max_number) {
                max_number = a;
            }
            if (a < min_number){
                min_number = a;
            }
        }
        System.out.println("Max element: " + max_number);
        System.out.println("Min element: " + min_number);
    }
}

