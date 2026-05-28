import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static double saldo = 1000.0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            Menu mainMenu = new Menu("Menu Principal", Arrays.asList("Conta", "Cliente", "Operacoes", "Sair"));
            int opcao = mainMenu.getSelection();

            switch (opcao) {
                case 1:
                    System.out.println("Opcao Conta selecionada");
                    break;
                case 2:
                    cadastrarCliente();
                    break;
                case 3:
                    exibirMenuOperacoes();
                    break;
                case 4:
                    System.out.println("\nEncerrando o programa...");
                    continuar = false;
                    break;
            }
        }

        System.out.println("Fim");
    }

    private static void cadastrarCliente() {
        System.out.println("\n=== CADASTRO DE CLIENTE ===\n");

        System.out.print("Informe o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Informe o CPF do cliente: ");
        String cpf = scanner.nextLine();

        System.out.println("\n--- Cliente cadastrado com sucesso ---");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }

    private static void exibirMenuOperacoes() {
        Menu menuOperacoes = new Menu("Operacoes", Arrays.asList("Realizar Saque", "Realizar Deposito", "Consultar Saldo", "Voltar"));
        int op = 0;
        while (op != 4) {
            op = menuOperacoes.getSelection();
            if (op == 1) {
                realizarSaque();
            }
            if (op == 2) {
                realizarDeposito();
            }
            if (op == 3) {
                consultarSaldo();
            }
        }
    }

    private static void realizarSaque() {
        System.out.print("Valor do saque: R$ ");
        try {
            double valor = Double.parseDouble(scanner.nextLine());
            if (valor <= 0) {
                System.out.println("Valor invalido.");
            } else if (valor > saldo) {
                System.out.println("Saldo insuficiente!");
            } else {
                saldo -= valor;
                System.out.printf("Novo saldo: R$ %.2f%n", saldo);
            }
        } catch (NumberFormatException e) {
            System.out.println("Valor invalido.");
        }
    }

    private static void realizarDeposito() {
        System.out.print("Valor do deposito: R$ ");
        try {
            double valor = Double.parseDouble(scanner.nextLine());
            if (valor <= 0) {
                System.out.println("Valor invalido.");
            } else {
                saldo += valor;
                System.out.printf("Novo saldo: R$ %.2f%n", saldo);
            }
        } catch (NumberFormatException e) {
            System.out.println("Valor invalido.");
        }
    }

    private static void consultarSaldo() {
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }
}