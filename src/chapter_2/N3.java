package chapter_2;

import java.util.Scanner;

public class N3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for feet:");

        double feet = input.nextDouble();
        double meter = feet * 0.305;

        System.out.printf("%.3f feet is %.3f meters", feet,meter);

    }
}
