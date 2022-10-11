package javaprogrammes;

// Compute the specific expression//

public class Programme12 {

    double a = 25.5;
    double b = 3.5;
    double c = 3.5;
    double d = 3.5;
    double e = 40.5;
    double f = 4.5;

    public static void main(String[] args) {
        Programme12 obj = new Programme12();
        obj.myMethod();


    }

    public void myMethod() {
        System.out.println((a * b - c * d) / (e - f));
    }
}
