package javaprogrammes;

 // Java programme to swap two variables//

import java.util.Scanner;

public class Programme15 {
    public static void main(String[] args) {
        myMethod();
    }
    public static void myMethod(){
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter any two variables : " );
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c ;
        System.out.println( "Before swapping : " + a + " and " + b );
        c=a;
        a=b;
        b=c;
        System.out.println("After swapping : " + a + " And "+ b);
        obj.close();



    }
}
