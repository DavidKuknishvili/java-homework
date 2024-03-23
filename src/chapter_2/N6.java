package chapter_2;

import java.util.Scanner;

public class N6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000:");

        int number = input.nextInt();

        int first = number % 10;
        number /= 10;
        int second = number % 10;
        number /= 10;
        int third = number % 10;
        number /= 10;
        int sum = third + second + first;

        System.out.printf("The sum of the digits is %d", sum);

    }
}
