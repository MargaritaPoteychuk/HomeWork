package pvt.java; //5. найти и вывести номер нулевых элементов.
// если нулевых элементов нет - вывести сообщение, что их нет

import java.util.Arrays;
import java.util.Scanner;

public class Task1_2_5 {

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
        boolean zero_elements_in_array = false;
        for (int i = 0; i < size; i++) {
            if (mass[i] == 0) {
                zero_elements_in_array = true;
                System.out.println("Zero element index: " + i);
            }
        }
        if (!zero_elements_in_array) {
            System.out.println("No zero elements");
        }

    }
}
