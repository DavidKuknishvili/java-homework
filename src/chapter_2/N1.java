package chapter_2;

import java.util.Scanner;

public class N1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        double C = input.nextDouble();

        double F = 9.0 / 5 * C + 32;
        System.out.printf("%.1fC = %.1fF", C,F);

    }
}
