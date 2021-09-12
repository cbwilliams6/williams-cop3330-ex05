package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Christian Williams
 */

public class App
{
    public static int numAddition(int num1, int num2)
    {
        int result = num1 + num2;
        return result;
    }
    public static int numSubtraction(int num1, int num2)
    {
        int result = num1 - num2;
        return result;
    }
    public static int numMultiply(int num1, int num2)
    {
        int result = num1 * num2;
        return result;
    }
    public static int numDivide(int num1, int num2)
    {
        int result = num1 / num2;
        return result;
    }
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the first number? ");
        String firstNum = input.nextLine();
        System.out.println("What is the second number? ");
        String secondNum = input.nextLine();

        int num1 = Integer.parseInt(firstNum);
        int num2 = Integer.parseInt(secondNum);

        int addition = numAddition(num1, num2);
        int subtraction = numSubtraction(num1, num2);
        int multiply = numMultiply(num1, num2);
        int divide = numDivide(num1, num2);
        System.out.println(num1 +  " + " + num2 + " = " + addition + "\n" +
                num1 +  " - " + num2 + " = " + subtraction + "\n" +
                num1 +  " * " + num2 + " = " + multiply + "\n" +
                num1 +  " / " + num2 + " = " + divide);
    }
}
