package day2;

import java.util.Scanner;

public class Scan1 {
    public static void main(String[] args) {

        System.out.println(4.5-2.7);
        System.out.format("I have %d cats, %d dogs, and 1 %s.", 7, 2, "panther");

       Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String userName = scanner.next();
        System.out.println(userName + " is a nice name.");

        System.out.println("\nHow old are you, " + userName + "?");
        int userAge = scanner.nextInt();
        System.out.println("Your name is " + userName + " and you are " + userAge + " years old.");

        System.out.println("\nHow tall are you in meters?");
        double userHeight = scanner.nextDouble();
        System.out.println("You are " + userHeight + " meters tall.");
    }
}
