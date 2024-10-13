package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.println("Enter the third number: ");
        int number3 = scanner.nextInt();

        int sum = number1 + number2 + number3;

        System.out.println("The sum of the three numbers is: " + sum);




        //Drugi yadatak
        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int lastNumber = scanner.nextInt();

        int currentNumber = firstNumber;

        while (currentNumber <= lastNumber) {
            System.out.println(currentNumber);
            currentNumber++;
        }
        scanner.close();
    }
}

