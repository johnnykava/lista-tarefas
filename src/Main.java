import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int escolha;

        do{
            escolha = menu();

        }while(escolha != 5);


    }

    public static int menu(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------- MENU ----------");
        System.out.println("[1] Adicionar Tarefa");
        System.out.println("[2] Remover Tarefa");
        System.out.println("[3] Listar todas as tarefas");
        System.out.println("[4] Buscar Tarefa");
        System.out.println("[5] Sair");
        System.out.print("Digite um número: ");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        return escolha;
    }
}
