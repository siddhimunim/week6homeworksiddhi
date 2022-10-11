package javaprogrammes;
/*
Write a program for a calculator with addition, subtraction, multiplication
        and division methods all with parameters and use string concatenation
        methods.(Note: Two static and Two instance methods.)*/

import java.util.Scanner;

public class Programme5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter first Number:  ");
        double Num1 = obj.nextDouble();
        System.out.println("Enter second Number:  ");
        double Num2 = obj.nextDouble();
        System.out.println("Enter the operation (+,-,*,/)");
        char opration = obj.next().charAt(0);


        if (opration == '+')              //define different operetions using 'IF'//
        {
            myMethod1(Num1, Num2);

            System.out.println(" Answer is " + (Num1 + Num2));

        }

        if (opration == '-') {
            System.out.print(" Answer is " + (Num1 - Num2));
            Programme5 obj1 = new Programme5();
            obj1.myMethod2(Num1, Num2);

        }
        if (opration == '*') {

            System.out.println(" Answer is " + (Num1 * Num2));
            myMetho3(Num1, Num2);
        }
        if (opration == '/') {
            System.out.println(" Answer is " + (Num1 / Num2));
            Programme5 obj2 = new Programme5();
            obj2.myMethod4(Num1, Num2);

        }
    }

    public static void myMethod1(double Num1, double Num2) {
        System.out.println(Num1 + Num2);
    }

    public void myMethod2(double Num1, double Num2) {
        System.out.println(Num1 - Num2);
    }

    public static void myMetho3(double Num1, double Num2) {
        System.out.println(Num1 * Num2);

    }

    public void myMethod4(double Num1, double Num2) {
        System.out.println(Num1 / Num2);
    }

}

