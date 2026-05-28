import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Menu mainMenu =  new Menu("Menu Principal", Arrays.asList("Conta", "Cliente", "Operacoes"));
		int selection = mainMenu.getSelection();
		System.out.println("Voce selecionou a funcionalidade " + mainMenu.getOption(selection) + ".");
		System.out.println("Fim");
	}

}