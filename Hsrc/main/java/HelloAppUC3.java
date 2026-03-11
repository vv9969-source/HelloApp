public class HelloAppUC3 {

    public static void main(String[] args) {

        // Using ternary operator
        String name = (args.length > 0) ? args[0] : "Vikas Vidiyala";

        System.out.println("Hello " + name);

    }
}