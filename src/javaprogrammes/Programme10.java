package javaprogrammes;

import java.util.Scanner;
/*
Write a Java program that takes a number as input and prints its
        multiplication table up to 10.*/
public class Programme10 {

    public static void main(String[] args) {
        myMethod();
    }

    public static void myMethod() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Input a number :");
        int Num = obj.nextInt();

        System.out.println(Num + "x1" + "=" + (Num * 1));
        System.out.println(Num + "x2" + "=" + (Num * 2));
        System.out.println(Num + "x3" + "=" + (Num * 2));
        System.out.println(Num + "x4" + "=" + (Num * 2));
        System.out.println(Num + "x5" + "=" + (Num * 2));
        System.out.println(Num + "x6" + "=" + (Num * 2));
        System.out.println(Num + "x7" + "=" + (Num * 2));
        System.out.println(Num + "x8" + "=" + (Num * 2));
        System.out.println(Num + "x9" + "=" + (Num * 2));
        System.out.println(Num + "x10" + "=" + (Num * 2));


        obj.close();

    }
}