package javaprogrammes;
/*
 Write a Java program that takes three numbers as input to calculate and
print the average of the numbers.*/

import java.util.Scanner;

public class Programme13 {
    public static void main(String[] args) {
        Programme13 obj = new Programme13();
        obj.myMethod();
    }

    public void myMethod() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter First Number :");
        double Num1 = obj.nextDouble();
        System.out.println("Enter Second Number :");
        double Num2 = obj.nextDouble();
        System.out.println("Enter Third Number :");
        double Num3 = obj.nextDouble();
        double avarage = (Num1 + Num2 + Num3) / 3;
        System.out.println("Avarage of three numbers = " + avarage);

    }

}
