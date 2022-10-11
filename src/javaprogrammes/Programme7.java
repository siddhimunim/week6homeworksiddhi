package javaprogrammes;

   /*a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C).*/

import java.util.Scanner;

public class Programme7 {
    public static void main(String[] args) {
        myMethod();                                  //calling static method to main method//
    }
    public static void myMethod(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter degree Fahrenheit value :");
          int F = obj.nextInt();
          int   Formula = (((F-32)*5)/9  );
        System.out.println( "Degree Celsius =" + Formula);
        obj.close();




    }
}
