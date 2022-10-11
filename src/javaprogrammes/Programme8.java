package javaprogrammes;

// programme to calculate the area of triangle//

//area = (base*height)/2;//


import java.util.Scanner;

public class Programme8 {
    public static void main(String[] args) {
        myMethod();

    }

    public static void myMethod() {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter base:");
        int base = obj.nextInt();
        System.out.println("Enter height:");
        int height = obj.nextInt();
        int area = (base * height / 2);
        System.out.println("Area of triangle =" + area);
        obj.close();

    }

}
