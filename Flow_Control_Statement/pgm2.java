package JavaPrograms;
import java.util.Scanner;
public class  pgm2 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = i.nextInt();
        System.out.print("Enter second number: ");
        int b = i.nextInt();
        boolean result = (a % 10) == (b % 10);
        System.out.println("last digit(" + a + " ," + b + " ) -> " + result);
    }
}

