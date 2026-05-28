import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean continuar = true;
		
		while (continuar) {
			Menu mainMenu = new Menu("Menu Principal", Arrays.asList("Conta", "Cliente", "Operacoes", "Sair"));
			int opcao = mainMenu.getSelection();
			
			switch (opcao) {
				case 1:
					System.out.println("Opção Conta selecionada");
					break;
				case 2:
					System.out.println("Opção Cliente selecionada");
					cadastrarCliente();
					break;
				case 3:
					System.out.println("Opção Operações selecionada");
					break;
				case 4:
					System.out.println("\nEncerrando o programa...");
					continuar = false;
					break;
			}
		}
		
		System.out.println("Fim");
	}
	
	public static void cadastrarCliente() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\n=== CADASTRO DE CLIENTE ===\n");
		
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