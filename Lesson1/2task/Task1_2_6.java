package pvt.java; //6. пройти по массиву и поменять местами каждые 2 соседних элемента

import java.util.Arrays;
import java.util.Scanner;

public class Task1_2_6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = input.nextInt();
        int[] mass = new int[size];
        for (int i = 0; i < mass.length; i++) {
            System.out.println("Enter the array element: ");
            mass[i] = input.nextInt();
        }
        System.out.println("Array elements: " + Arrays.toString(mass));
        for (int i = 0; i < mass.length; i += 2) {
            int a = mass[i];
            if (i + 1 == mass.length) {
                System.out.println("Break");
                break;
            }
            int b = mass[i + 1];
            System.out.println(a);
            mass[i] = b;
            System.out.println(a);
            mass[i + 1] = a;
        }
        System.out.println("Array with switched elements: " + Arrays.toString(mass));
    }
}

