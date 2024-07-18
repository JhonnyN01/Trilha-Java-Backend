package desafio_dio_banco;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Cliente clienteCorrente = null;
        Cliente clientePoupanca = null;
        Conta contaCorrente = null;
        Conta contaPoupanca = null;

        while (true) {
            System.out.println("Bem-vindo ao Banco!");
            System.out.println("1. Abrir Conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Transferir");
            System.out.println("5. Sair");

            int opcao = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (opcao) {
                case 1:
                    System.out.println("1. Abrir Conta Corrente");
                    System.out.println("2. Abrir Conta Poupança");
                    int tipoConta = sc.nextInt();
                    sc.nextLine(); // Consume newline

                    System.out.println("Digite seu nome para cadastro:");
                    String nome = sc.nextLine();

                    System.out.println("Digite sua identidade para cadastro:");
                    String identidade = sc.nextLine();

                    System.out.println("Digite seu CPF para cadastro:");
                    String cpf = sc.nextLine();

                    System.out.println("Digite seu endereço de residência para cadastro:");
                    String endereco = sc.nextLine();

                    Cliente novoCliente = new Cliente();
                    novoCliente.setNome(nome);

                    if (tipoConta == 1) {
                        contaCorrente = new ContaCorrente(novoCliente);
                        clienteCorrente = novoCliente;
                        System.out.println("Digite um valor para depósito inicial (mínimo R$ 10,00):");
                        double valorInicial = sc.nextDouble();
                        if (valorInicial >= 10) {
                            contaCorrente.depositar(valorInicial);
                            System.out.println("Conta Corrente ativada com sucesso!");
                        } else {
                            System.out.println("Depósito inicial insuficiente. Conta não ativada.");
                        }
                        contaCorrente.imprimirExtrato();
                    } else if (tipoConta == 2) {
                        contaPoupanca = new ContaPoupanca(novoCliente);
                        clientePoupanca = novoCliente;
                        System.out.println("Digite um valor para depósito inicial (mínimo R$ 10,00):");
                        double valorInicial = sc.nextDouble();
                        if (valorInicial >= 10) {
                            contaPoupanca.depositar(valorInicial);
                            System.out.println("Conta Poupança ativada com sucesso!");
                        } else {
                            System.out.println("Depósito inicial insuficiente. Conta não ativada.");
                        }
                        contaPoupanca.imprimirExtrato();
                    }
                    break;
                case 2:
                    System.out.println("Digite o número da conta para depósito:");
                    int numeroContaDeposito = sc.nextInt();
                    System.out.println("Digite o valor para depósito:");
                    double valorDeposito = sc.nextDouble();

                    if (contaCorrente != null && numeroContaDeposito == contaCorrente.getNumero()) {
                        contaCorrente.depositar(valorDeposito);
                        contaCorrente.imprimirExtrato();
                    } else if (contaPoupanca != null && numeroContaDeposito == contaPoupanca.getNumero()) {
                        contaPoupanca.depositar(valorDeposito);
                        contaPoupanca.imprimirExtrato();
                    } else {
                        System.out.println("Conta não encontrada ou não ativada.");
                    }
                    break;
                case 3:
                    System.out.println("1. Sacar da Conta Corrente");
                    System.out.println("2. Sacar da Conta Poupança");
                    int tipoSaque = sc.nextInt();

                    System.out.println("Digite o valor para saque:");
                    double valorSaque = sc.nextDouble();

                    if (tipoSaque == 1 && contaCorrente != null) {
                        contaCorrente.sacar(valorSaque);
                        contaCorrente.imprimirExtrato();
                    } else if (tipoSaque == 2 && contaPoupanca != null) {
                        contaPoupanca.sacar(valorSaque);
                        contaPoupanca.imprimirExtrato();
                    } else {
                        System.out.println("Conta não encontrada ou não ativada.");
                    }
                    break;
                case 4:
                    System.out.println("Digite o número da conta para transferência:");
                    int numeroContaTransferencia = sc.nextInt();
                    System.out.println("Digite o valor para transferência:");
                    double valorTransferencia = sc.nextDouble();

                    if (contaCorrente != null && contaPoupanca != null) {
                        if (numeroContaTransferencia == contaCorrente.getNumero()) {
                            contaCorrente.transferir(valorTransferencia, contaPoupanca);
                            contaCorrente.imprimirExtrato();
                            contaPoupanca.imprimirExtrato();
                        } else if (numeroContaTransferencia == contaPoupanca.getNumero()) {
                            contaPoupanca.transferir(valorTransferencia, contaCorrente);
                            contaCorrente.imprimirExtrato();
                            contaPoupanca.imprimirExtrato();
                        } else {
                            System.out.println("Conta não encontrada ou não ativada.");
                        }
                    } else {
                        System.out.println("Contas não encontradas ou não ativadas.");
                    }
                    break;
                case 5:
                    System.out.println("Obrigado por usar o Banco. Até logo!");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
