package chapter_12;

import java.util.Random;
import java.util.Scanner;

public class N3 {
    public static void main(String[] args) {


        int[] array = new int[100];

        for (int i = 0; i < 100; i++) {
            Random random = new Random();

            array[i] = random.nextInt();
        }

        try {


            System.out.print("Input index:");
            Scanner input = new Scanner(System.in);

            int inp_index = input.nextInt();

            System.out.println("array value in index of " + inp_index + " is " + array[inp_index]);
        }catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("Out of Bound");
        }

    }
}
