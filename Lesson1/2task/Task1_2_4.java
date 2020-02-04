package pvt.java; //4. найти количество нулевых элементов,
// вывести количество. если нулевых элементов нет - вывести сообщение, что их нет

import java.util.Arrays;
import java.util.Scanner;

public class Task1_2_4 {

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
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (mass[i] == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("There is no zero elements.");
        } else {
            System.out.println("There are " + count + " zero elements");
        }
    }
}
