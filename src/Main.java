import model.Tarefa;
import service.GerenciadorTarefa;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static final Path CAMINHO_ARQUIVO = Paths.get("lista-tarefas.txt");

    public static void main(String[] args) {
        LinkedList<Tarefa> listaTarefa = new LinkedList<>();
        GerenciadorTarefa gerenciadorTarefa = new GerenciadorTarefa();
        Scanner scanner = new Scanner(System.in);

        int escolha, contador = 0;

        do{
            escolha = menu();

            switch (escolha){
                case 1:
                    contador++;
                    gerenciadorTarefa.adicionarTarefa(contador, listaTarefa, scanner);
                    break;
                case 2:
                    gerenciadorTarefa.removerTarefa(listaTarefa, scanner);
                    break;
                case 3:
                    gerenciadorTarefa.listarTarefas(listaTarefa);
                    break;
                case 4:
                    gerenciadorTarefa.concluirTarefa(listaTarefa, scanner);
                    break;
                case 5:
                    System.out.println("Obrigado por usar o nosso sistema de Tarefas!");
                    break;
                default:
                    System.out.println("Digite uma opção valida do menu!");
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
        System.out.println("[4] Concluir Tarefa");
        System.out.println("[5] Sair");
        System.out.print("Digite um número: ");
        int escolha = scanner.nextInt();
        scanner.nextLine();
        System.out.println("--------------------------");

        return escolha;
    }
}
