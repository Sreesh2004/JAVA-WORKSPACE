package JavaPrograms;
import java.util.Scanner;
public class pgm15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int i = 1;
        while (i <= rows) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            i++;
        }
    }
}