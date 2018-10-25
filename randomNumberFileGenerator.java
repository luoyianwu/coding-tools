import java.io.PrintWriter;

public class randomNumberFileGenerator {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java randomNumberFileGenerator numInt minimum maximum");
        }
        int num = Integer.valueOf(args[0]);
        int min = Integer.valueOf(args[1]);
        int max = Integer.valueOf(args[2]);
        try (PrintWriter out = new PrintWriter("output.txt")) {
            for (int i = 0; i < Integer.valueOf(args[0]); i++) {
                out.print((int)(Math.random() * (max - min)) + min);
                out.print(" ");
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}