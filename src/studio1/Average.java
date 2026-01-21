package studio1;
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.println("Enter first number");
    int n1 = in.nextInt();
    System.out.println(n1);
    System.out.println("Enter second number");
    int n2 = in.nextInt();
    System.out.println(n2);
    double average = (n1 + n2)/2;
    System.out.println("the average of the two numbers is " + average);
    }
}