package chapter_2;

import java.util.Scanner;

public class N4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number in pounds:");

        double pounds = input.nextDouble();
        double kilograms = pounds * 0.454;

        System.out.printf("%.3f pounds is %.3f kilograms", pounds,kilograms);

    }
}
