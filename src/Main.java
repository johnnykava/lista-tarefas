import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static final Path CAMINHO_ARQUIVO = Paths.get("lista-tarefas.txt");

    public static void main(String[] args) {
        LinkedList<Tarefa> listaTarefa = new LinkedList<>();

        int escolha, contador = 0;

        do{
            escolha = menu();

            switch (escolha){
                case 1:
                    contador++;
                    adicionarTarefa(contador, listaTarefa);
                    break;
                case 2:
                    removerTarefa(listaTarefa);
                    break;
                case 3:
                    listarTarefas(listaTarefa);
                    break;
            }

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

    public static void adicionarTarefa(int contador, LinkedList<Tarefa> listaTarefa){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o titulo da tarefa: ");
        String titulo = scanner.nextLine();

        listaTarefa.add(new Tarefa(contador, titulo));

        System.out.println("Tarefa Adicionada com sucesso!");
    }

    public static void removerTarefa(LinkedList<Tarefa> listaTarefa){
        Scanner scanner = new Scanner(System.in);

        if(listaTarefa.isEmpty()){
            System.out.println("A lista está vazia, não é possivel remover!");
            return;
        }

        listarTarefas(listaTarefa);

        System.out.print("Digite o id da tarefa que deseja remover: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        id = id - 1;

        System.out.println("Tarefa '" + listaTarefa.get(id).getTitulo() + "' removido com sucesso!");

        listaTarefa.remove(id);
    }

    public static void listarTarefas(LinkedList<Tarefa> listaTarefa){
        if(listaTarefa.isEmpty()){
            System.out.println("A lista está vazia, não é possivel listar!");
            return;
        }

        for(Tarefa tarefas : listaTarefa){
            if(!tarefas.isConcluida()){
                System.out.println("[] " + tarefas.getId() + " " + tarefas.getTitulo());
            }
            else {
                System.out.println("[x] " + tarefas.getId() + " " + tarefas.getTitulo());
            }
        }

    }
}
