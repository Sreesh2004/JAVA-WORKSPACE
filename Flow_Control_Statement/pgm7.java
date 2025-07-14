package JavaPrograms;
import java.util.*;
public class pgm7 {
    public static void main(String[] args) {
    	    Scanner i = new Scanner(System.in);
        char c = i.next().charAt(0);;

        if (Character.isLowerCase(c)) {
            System.out.println(c + " -> " + Character.toUpperCase(c));
        } else if (Character.isUpperCase(c)) {
            System.out.println(c + " -> " + Character.toLowerCase(c));
        } else {
            System.out.println("Invalid character input");
        }
    }
}