import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static double saldo = 1000.0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Menu mainMenu = new Menu("Menu Principal", Arrays.asList("Conta", "Cliente", "Operacoes"));

        int opcao = mainMenu.getSelection();

        if (opcao == 3) {
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

        System.out.println("Fim");
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
