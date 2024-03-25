package chapter_12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class N2 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num_1 = 0;
        int num_2 = 0;

        while (true) {

            try{
                System.out.print("Enter 2 number: ");
                num_1 = input.nextInt();
                num_2 = input.nextInt();

                break;
            }
            catch (InputMismatchException e){
                System.out.print("You must enter integers");
                input.nextLine();

            }
        }


        int sum = num_1 + num_2;

        System.out.println(num_1+ " + " + num_2 + " = " + sum);



    }
}
