package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Instanciate an object of type Scanner.
        Scanner newScanner=new Scanner(System.in);

        //Asking for the user to enter the first number
        System.out.println("Enter the first number:");

        //Storing the entered data inside the variable
         int firstNumber=newScanner.nextInt();

         //Asking to the user to enter the second value
        System.out.println("Enter the second number:");

        //Storing the second vale entered from the user inside the second variable
        int secondNumber=newScanner.nextInt();

       // System.out.println("The two number are:"+firstNumber+" "+secondNumber);

        System.out.println(numberComparator(firstNumber,secondNumber));

    }

    //Defining a public static String method that return the the comparision between the two number entred by the user.
    //Using the number entered by the user lke two parameters.
    public static String  numberComparator(int firstNumber, int secondNumber){

        if (firstNumber>secondNumber){
            System.out.println("First number is greater than second number.");
        }if(firstNumber<secondNumber){
            System.out.println("First Number is smaller than second number.");
        } if(firstNumber==secondNumber){
            System.out.println("The first and the second number are equals. ");
        } if(firstNumber!=secondNumber){
            System.out.println("The two numbers are different.");
        }


      return "The check number finished is task.";
    }

}
