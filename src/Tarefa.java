public class Tarefa {
    private int id;
    private String titulo;
    private boolean concluida;

    //Construtor NO ARGS
    public Tarefa() {
    }

    //Construtor ALL ARGS
    public Tarefa(int id, String titulo, boolean concluida) {
        this.id = id;
        this.titulo = titulo;
        this.concluida = concluida;
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
        return "Tarefa{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", concluida=" + concluida +
                '}';
    }
}
