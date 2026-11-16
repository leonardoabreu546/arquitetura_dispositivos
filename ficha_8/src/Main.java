import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (GameOption option : GameOption.values()) {
            System.out.println(option);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha uma opção: ");
        String selectedOption = scanner.nextLine();

        if (selectedOption.equals("START")) {
            System.out.println("A iniciar o jogo...");
        } else if (selectedOption.equals("SAVEGAME")) {
            System.out.println("A guardar o jogo...");
        } else if (selectedOption.equals("LOADGAME")) {
            System.out.println("A carregar o jogo...");
        } else if (selectedOption.equals("HIGHSCORES")) {
            System.out.println("A mostrar os recordes...");
        } else if (selectedOption.equals("QUIT")) {
            System.out.println("A sair do jogo...");
        } else {
            System.out.println("Opção inválida.");
        }

        System.out.println("Resultado com switch:");
        switch (selectedOption) {
            case "START":
                System.out.println("A iniciar o jogo...");
                break;
            case "SAVEGAME":
                System.out.println("A guardar o jogo...");
                break;
            case "LOADGAME":
                System.out.println("A carregar o jogo...");
                break;
            case "HIGHSCORES":
                System.out.println("A mostrar os recordes...");
                break;
            case "QUIT":
                System.out.println("A sair do jogo...");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
