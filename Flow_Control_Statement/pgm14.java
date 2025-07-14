package JavaPrograms;
import java.util.*;
public class pgm14 {
	public static void main(String[] args) {
		Scanner i = new Scanner (System.in);
		int s = 0;
		for (int n = i.nextInt() ; n>0 ; n/=10) {
			s += n%10 ;
		}
		System.out.print(s);
	}
}
