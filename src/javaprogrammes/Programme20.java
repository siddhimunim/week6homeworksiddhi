package javaprogrammes;

import java.util.Scanner;

public class Programme20 {
    public static void main(String[] args) {
myMethod();

    }
        public static void myMethod () {
            Scanner obj = new Scanner(System.in);
            System.out.println("Please enter date :" + "year-month-date");
            String Date = obj.nextLine();
            System.out.println("Enter time :"+"  AM/PM + ");
            String Time = obj.nextLine();
           System.out.println("Enter gallons : ");
            float Gallons = obj.nextFloat();
            System.out.println("Enter Price per gallon :");
            float Price = obj.nextFloat();

            float Total = Gallons * Price;


            System.out.println("         \"+--------------------------------------+\"               ");
            System.out.println("         \"|                                      |\"                          ");
            System.out.println("         \"|            CORNER  STORE             |\"                          ");
            System.out.println("         \"|                                      |\"                            ");
            System.out.println("         \"|     " + Date+"  "+     Time   +      "              |\"");
            System.out.println("         \"|                                      |\"                  ");
            System.out.println("        \" |     Gallons :    " + Gallons + "                |\"");
            System.out.println("         \"|     Price/gallon :" + "$" + Price + "             |\" ");
            System.out.println("         \"|     Fuel total : " + "$" + Total                +"        |\" ");
            System.out.println("         \"|                                      |\"                  ");
            System.out.println("         \"+--------------------------------------+\"               ");

            obj.close();
        }
    }
