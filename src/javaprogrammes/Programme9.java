package javaprogrammes;

// Programme for uppercase and lowercase letters//


import java.util.Scanner;

public class Programme9 {

    public static void main(String[] args) {
        myMethod();
    }

    public static void myMethod() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter any Uppercase sentence to convert Lowercase :");
        String sentence = obj.nextLine();
        System.out.println(sentence.toLowerCase());

    }

}
