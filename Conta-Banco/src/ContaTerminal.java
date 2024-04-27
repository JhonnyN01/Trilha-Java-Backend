import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e Importar a classe Scanner.
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuario.
        System.out.println("Por favor, digite o numero da conta");
        int numero = scanner.nextInt();

        System.out.println("Digite o numero da agencia");
        String agencia = scanner.next();

        System.out.println("Digite o nome do cliente");
        String nomeCliente = scanner.next();

        System.out.println("Digite o saldo do Cliente");
        Double saldo = scanner.nextDouble();

        //Obter pela scanner os valores digitados no terminal.

        //Exibir a mensagem conta criada.
        System.out.println("Ola " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agencia eh " + agencia + ", conta " + numero + " e seu saldo " + saldo + " ja esta disponivel para saque.");



        scanner.close();
    }
}
