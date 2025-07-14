package JavaPrograms;
import java.util.*;
public class pgm12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = 0;
        if (num <= 1) {
            System.out.println("Not a Prime Number");
        } 
        else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Not a Prime Number");
            }
        }
    }
}
