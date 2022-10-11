package javaprogrammes;

     /*a program to enter any radius value of the circle and find out the
     area.(Formula of Area A=PI*r*r).*/


import java.util.Scanner;

public class Programme6 {
    public static void main(String[] args) {
        myMethod();

    }
    public static void myMethod(){
        Scanner Programme6 = new Scanner(System.in);
        System.out.print("Please enter radius r :");
        double PI = 3.14;
        int r = Programme6.nextInt();
        System.out.println("Area A =" + PI*r*r);  //formula apply//
        Programme6.close();

    }
}
