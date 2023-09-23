// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static final Scanner myInput = new Scanner(System.in);

    private static void calc2numbers() {
        System.out.println("Enter 2 numbers");
        final String str_n1 = myInput.next();
        final String str_n2 = myInput.next();
        final int num1 = Integer.parseInt(str_n1);
        final int num2 = Integer.parseInt(str_n2);
        System.out.printf("%d+%d=%d\n", num1, num2, num1 + num2);
        System.out.printf("%d-%d=%d\n", num1, num2, num1 - num2);
        System.out.printf("%d*%d=%d\n", num1, num2, num1 * num2);
        System.out.printf("%d/%d=%d\n\n", num1, num2, num1 / num2);
    }

    private static void calcAreaOfTriangle() {
        System.out.println("Enter the edge length and according height to the edge of the triangle\n");
        final String str_n1 = myInput.next();
        final String str_n2 = myInput.next();
        final double edgeLength = Double.parseDouble(str_n1);
        final double accordingHeight = Double.parseDouble(str_n2);
        System.out.printf("The area of the triangle: %.2f\n", 0.5 * edgeLength * accordingHeight);
    }

    private static void posNegZero() {
        System.out.println("Enter a number\n");
        final String str_n1 = myInput.next();
        final double number2Compare = Double.parseDouble(str_n1);
        if (number2Compare==0){
            System.out.println("The number '0.00' is zero");
        }
        else if(number2Compare>0){
            System.out.printf("The number '%.2f' is positive\n",number2Compare);
        }
        else {
            System.out.printf("The number '%.2f' is negative\n",number2Compare);
        }
    }

    private static void usernamePassword(){
        System.out.println("Please enter your credentials:\n " +
                "username, password in one line separating with a space \n");
        final String str_n1 = myInput.next();
        final String str_n2 = myInput.next();
        if(Objects.equals(str_n1, "Umut") && Objects.equals(str_n2, "Leidenschaftliche")){
            System.out.println("Provided credentials are valid.");
        }
        else {
            System.out.println("Provided credentials are not valid");
        }
    }

    public static void main(String[] args) {
        calc2numbers();
        calcAreaOfTriangle();
        posNegZero();
        usernamePassword();
    }
}