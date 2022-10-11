package javaprogrammes;
/*
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.*/
//Declare instance and static variables into both methods//

public class Proggrame3 {
    int a = 20;
    static String name = "Siddhi";

    public static void main(String[] args) {          //calling instance and static both methods to main method//
        Proggrame3 obj = new Proggrame3();
        obj.myMethod();
        myMethod2();

    }

    public void myMethod() {                            // instance method//
        System.out.println(a);
        System.out.println(name);

    }

    public static void myMethod2() {                  // static method//
        Proggrame3 obj = new Proggrame3();
        System.out.println(obj.a);

        System.out.println(name);


    }


}
