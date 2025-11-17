package projeto.integrador.model;

public class Topicos {
    int id;
    String titulo;
    String descricao;

    public Topicos(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public Topicos(int id, String titulo, String descricao) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }
}
