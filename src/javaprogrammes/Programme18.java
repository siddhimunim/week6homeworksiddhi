package javaprogrammes;
/*a Java program to print the sum (addition), multiply, subtract, divide and
        remainder of two numbers.

 */

import java.util.Scanner;

public class Programme18 {

    public static void main(String[] args) {
         myMethod();
    }
    public static void myMethod(){
        Scanner obj = new Scanner(System.in);
        System.out.println(" Enter First Number : ");
        int Num1 = obj.nextInt();
        System.out.println("Enter Second Number : ");
        int Num2 = obj.nextInt();

        System.out.println(Num1 + "+" +  Num2 + "=" +( Num1 + Num2));

        System.out.println(Num1 + "-" +  Num2 + "=" +( Num1 - Num2));
        System.out.println(Num1 + "x" +  Num2 + "=" +( Num1 * Num2));
        System.out.println(Num1 + "/" +  Num2 + "=" +( Num1 / Num2));
        System.out.println(Num1 + "mod" +  Num2 + "=" +( Num1 % Num2));
        obj.close();

    }



}



