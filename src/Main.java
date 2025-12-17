import java.util.Scanner;

public class Main {
   private final static String WELCOME_MESSAGE = "Hello World!";
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //var scanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);
        System.out.println("Olá, informe o seu nome:");
        String name = scanner.next();
        //var name = scanner.next();
        System.out.println(name + ", informe sua idade:");
        int age = scanner.nextInt();
        //var age = scanner.nextInt();
        System.out.println("Olá, " + name + ". Você tem: " + age + " anos.");
        //System.out.printl("Olá, %s você tem: %s", name, age);

    }
}
