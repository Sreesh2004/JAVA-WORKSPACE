package JavaPrograms;

public class pgm4 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No Values");
        }
        if (args.length > 0) {
            System.out.print(args[0]);
            for (int i = 1; i < args.length; i++) {
                System.out.print(", " + args[i]);
            }
        }
    }
}


