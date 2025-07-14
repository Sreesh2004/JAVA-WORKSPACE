package JavaPrograms;
import java.util.*;
public class pgm5 {
    public static void main(String[] args) {
    	    Scanner i = new Scanner(System.in); 
        char c1 = i.next().charAt(0);
        char c2 = i.next().charAt(0);

        if (c1 < c2) {
            System.out.println(c1 + ", " + c2);
        }
        if (c1 > c2) {
            System.out.println(c2 + ", " + c1);
        }
    }
}

