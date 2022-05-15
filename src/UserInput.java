package src;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = 1.1;
        System.out.println("Value of x is " + x);
        System.out.println("Enter new value of x:");
        x = input.nextDouble();
        System.out.println("Updated value of x is " + x);
        System.out.println(x);
    }
}
