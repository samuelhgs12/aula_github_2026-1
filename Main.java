import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Menu mainMenu =  new Menu("Menu Principal", Arrays.asList("Conta", "Cliente", "Operacoes"));
		int opcao = mainMenu.getSelection();
		System.out.println(opcao + " foi selecionada");
		
		if (opcao == 2) {
			cadastrarCliente();
		}
		
		System.out.println("Fim");
	}
	
	public static void cadastrarCliente() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\n==== CADASTRO DE CLIENTE ====\n");
		
		System.out.print("Informe o nome do cliente: ");
		String nome = scanner.nextLine();
		
		System.out.print("Informe o CPF do cliente: ");
		String cpf = scanner.nextLine();
		
		System.out.println("\n--- Cliente cadastrado com sucesso ---");
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println();
	}

}