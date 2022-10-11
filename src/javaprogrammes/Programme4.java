package javaprogrammes;
/*
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.*/


public class Programme4 {

    int a = 5;
    String digit = "Numeric";
    static int b = 10;
    static String name = "Number";


    public static void main(String[] args) {
        Programme4 obj = new Programme4();     //calling method in to main method//
        obj.myMethod1();
        myMethod2();
    }

    public void myMethod1() {

        System.out.println(a);
        System.out.println(digit);
        System.out.println(Programme4.b);
        System.out.println(Programme4.name);
    }

    public static void myMethod2() {
        Programme4 obj = new Programme4();
        System.out.println(obj.a);
        System.out.println(obj.digit);
        System.out.println(b);
        System.out.println(name);

    }

}
