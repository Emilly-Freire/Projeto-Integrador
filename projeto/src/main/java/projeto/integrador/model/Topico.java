package projeto.integrador.model;

public class Topico {

    private int id; 
    private String titulo;
    private String descricao;

    
    public Topico() {
    }

    public Topico(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public Topico(int id, String titulo, String descricao) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    // --- Getters ---
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }
    
    //-- Setters ---
    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + " | Descrição: " + descricao;
    }
}