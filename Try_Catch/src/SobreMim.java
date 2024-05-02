import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class SobreMim {
    public static void main(String[] args) throws Exception {
        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Ola me chamo " + nome.toUpperCase() + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura eh de " + altura + " cm");
        scanner.close();
        }
        catch (InputMismatchException e) {
            //vai solicitar caso seja digitado numero e altura com ,
            System.err.println("Os Campos idade e altura precisam ser numericos.");
        }
    }
}
