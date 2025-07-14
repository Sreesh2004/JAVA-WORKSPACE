package JavaPrograms;
import java.util.*;
public class pgm6 {
    public static void main(String[] args) {
    	Scanner i = new Scanner(System.in);
        String gender = i.nextLine();
        int age = i.nextInt();

        if (gender.equals("Female") && age >= 1 && age <= 58) {
            System.out.println("Interest: 8.2%");
        } else if (gender.equals("Female") && age >= 59 && age <= 100) {
            System.out.println("Interest: 9.2%");
        } else if (gender.equals("Male") && age >= 1 && age <= 58) {
            System.out.println("Interest: 8.4%");
        } else if (gender.equals("Male") && age >= 59 && age <= 100) {
            System.out.println("Interest: 10.5%");
        } else {
            System.out.println("Invalid");
        }
    }
}