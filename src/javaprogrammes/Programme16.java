package javaprogrammes;
/*a Java program to add two binary numbers.

 */


public class Programme16 {
    public static void main(String[] args) {

       Programme16 obj = new Programme16();
       obj.myMethod();

    }
    public void myMethod(){
        String X = "10";
        String Y = "11";
        int num1 = Integer.parseInt(X ,2);
        int num2 = Integer.parseInt(Y,2);
        int Total = num1 + num2;
        System.out.println("Sum of two binary numbers: " +  Integer.toBinaryString(Total ));

    }
}
