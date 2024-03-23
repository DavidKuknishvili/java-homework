package chapter_2;

import java.util.Scanner;

public class N5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate:");

        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();


        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;


        System.out.printf("The gratuity is %.1f and total is %.1f", gratuity, total);

    }
}
