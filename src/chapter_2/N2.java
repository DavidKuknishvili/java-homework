package chapter_2;

import java.util.Scanner;

public class N2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius and length of a cylinder:");

        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = radius*radius*3.14;
        double volume = area*length;
        System.out.printf("The area is %f\n", area);
        System.out.printf("The volume is %f", volume);

    }
}
