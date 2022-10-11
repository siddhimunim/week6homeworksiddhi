package javaprogrammes;

//calculation of area and perimeter of a rectangle//
// area = width*height//
// perimeter = 2*(width+height)//

import java.util.Scanner;

public class Programme14 {


    public static void main(String[] args) {
        Programme14 obj = new Programme14();
        obj.myMethod();

    }

    public void myMethod() {
        Scanner obj = new Scanner(System.in);                                 // area of rectangle//
        System.out.println("                          Calculation of AREA of Ractangle         ");
        System.out.println(" enter value of width :");
        float Num1 = obj.nextFloat();
        System.out.println(" enter value of height :");
        float Num2 = obj.nextFloat();
        float area = Num1 * Num2;
        System.out.println("Area of Ractangle = " + area);


        System.out.println("                          Calculation of perimeter of Ractangle         ");
        System.out.println(" enter value of width :");
        float Num3 = obj.nextFloat();
        System.out.println(" enter value of height :");
        float Num4 = obj.nextFloat();
        float Perimeter = 2 * (Num3 + Num4);
        System.out.println("Perimeter of Ractangle = " + Perimeter);
        obj.close();
    }

}
