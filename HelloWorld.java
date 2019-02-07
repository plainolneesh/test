package example;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       String Statement;
       String newStatement;

        System.out.println("What would you like to say? ");

        Statement = input.nextLine();

        System.out.println("Anything else?");

        newStatement = input.nextLine();

        System.out.println("First you said: " + Statement);

        System.out.println("Then you said: " + newStatement);


    }
}
