import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu {
	private String title;
	private List<String> options;

	public Menu(List<String> options) {
		this.title = "Menu";
		this.options = options;
	}

	public Menu(String title, List<String> options) {
		this.title = title;
		this.options = options;
	}

	public String getOption(int selection) {
		return options.get(selection - 1);
	}

	public int getSelection() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println(title+"\n");
			int i=1;
			for (String option : options) {
				System.out.println(i++ + " - " + option);
			}

			System.out.println("Informe a opcao desejada. ");
			String str = scanner.nextLine().trim();
			if (str.isEmpty()) {
				System.out.println("Entrada vazia. Digite o numero de uma opcao.");
				continue;
			}

			int op;
			try {
				op = Integer.parseInt(str);
			}
			catch (NumberFormatException e) {
				System.out.println("Entrada invalida. Digite apenas o numero da opcao.");
				continue;
			}

			if (op < 1 || op >= i) {
				System.out.println("Opcao invalida. Escolha um numero entre 1 e " + options.size() + ".");
				continue;
			}

			if (options.get(op - 1).equals("Conta")) {
				Menu contaMenu = new Menu("Conta", Arrays.asList("Abrir Conta", "Encerrar Conta", "Consultar Conta"));
				op = contaMenu.getSelection();
			}

			return op;
		}
	}
}