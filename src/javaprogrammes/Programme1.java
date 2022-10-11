package javaprogrammes;
/*1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme.*/

// Declare instance method into static//

public class Programme1 {
    int a = 20;
    int b = 10;

    public static void main(String[] args) {
        Programme1 obj = new Programme1();
        obj.myMethod();
    }

    public void myMethod() {
        System.out.println(a);
        System.out.println(b);
    }


}
