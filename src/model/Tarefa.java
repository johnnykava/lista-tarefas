package model;

public class Tarefa {
    private int id;
    private String titulo;
    private boolean concluida = false;

    //Construtor NO ARGS
    public Tarefa() {
    }

    //Construtor ALL ARGS
    public Tarefa(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    //Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "model.Tarefa{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", concluida=" + concluida +
                '}';
    }
}
