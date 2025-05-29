import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static final Path CAMINHO_ARQUIVO = Paths.get("lista-tarefas.txt");

    public static void main(String[] args) {
        int escolha, contador = 0;

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
        System.out.println("--------------------------");

        return escolha;
    }

    public static void adicionarTarefa(int contador){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o titulo da tarefa: ");
        String titulo = scanner.nextLine();

        LinkedList<Tarefa> listaTarefa = new LinkedList<>();

        listaTarefa.add(new Tarefa(contador, titulo));
    }
}
