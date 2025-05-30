package service;

import model.Tarefa;
import java.util.LinkedList;
import java.util.Scanner;

public class GerenciadorTarefa {

    public void adicionarTarefa(int contador, LinkedList<Tarefa> listaTarefa, Scanner scanner){
        System.out.print("Digite o titulo da tarefa: ");
        String titulo = scanner.nextLine();

        listaTarefa.add(new Tarefa(contador, titulo));

        System.out.println("Tarefa Adicionada com sucesso!");
    }

    public void removerTarefa(LinkedList<Tarefa> listaTarefa, Scanner scanner){
        if(listaTarefa.isEmpty()){
            System.out.println("A lista está vazia, não é possivel remover!");
            return;
        }

        listarTarefas(listaTarefa);

        System.out.print("Digite o id da tarefa que deseja remover: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        if(id < 1 || id > listaTarefa.size()){
            System.out.println("ID invalido!");
            return;
        }

        id = id - 1;

        System.out.println("Tarefa '" + listaTarefa.get(id).getTitulo() + "' removido com sucesso!");

        listaTarefa.remove(id);
    }

    public void listarTarefas(LinkedList<Tarefa> listaTarefa){
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

    public void concluirTarefa(LinkedList<Tarefa> listaTarefa, Scanner scanner){
        if(listaTarefa.isEmpty()){
            System.out.println("A lista de tarefas está vazia, não tem como concluir!");
            return;
        }

        listarTarefas(listaTarefa);

        System.out.print("Digite o número da tarefa que deseja concluir: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        if(id < 1 || id > listaTarefa.size()){
            System.out.println("ID invalido!");
            return;
        }

        listaTarefa.get(id - 1).setConcluida(true);
    }
}
