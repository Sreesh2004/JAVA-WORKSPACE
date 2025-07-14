package JavaPrograms;
import java.util.*;
public class pgm8 {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		char code = i.next().toUpperCase().charAt(0);
		switch (code) 
		{
		case 'R' :
			System.out.print("Red");
			break;
		case 'B' :
			System.out.print("Blue");
			break;
		case 'G' :
			System.out.print("Green");
			break;
		case 'O' :
			System.out.print("Orange");
			break;
		case 'Y' :
			System.out.print("Yellow");
			break;
		case 'W' :
			System.out.print("White");
			break;
		default :
			System.out.print("Invalid");
		}
	}

}
