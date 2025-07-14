package JavaPrograms;
import java.util.Scanner;
public class pgm16 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int num = i.nextInt();
        int r = 0;
        while (num != 0) {
            int digit = num % 10;
            r = r * 10 + digit;
            num /= 10;
        }
        System.out.println(r);
    }
}
