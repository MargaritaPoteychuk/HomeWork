package pvt.java; //10. проверить, является ли массив возрастающей последовательностью
// (каждое следующее число больше предыдущего)

import java.util.Arrays;
import java.util.Scanner;

public class Task1_2_10 {

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
        boolean correct = true;
        for (int i = 0; i < mass.length; i++) {
            int a = mass[i];
            if (i == mass.length - 1) {
                break;
            }
            int b = mass[i + 1];
            if (a < b) {
                System.out.println(a + " < " + b + " = OK");
            }
            if (a > b) {
                System.out.println(a + " > " + b + " = FAIL");
                correct = false;
                break;
            }
        }
        if (correct){
            System.out.println("Array is an increasing sequence.");
        }
        else {
            System.out.println("Array is NOT an increasing sequence.");
        }
    }
}

