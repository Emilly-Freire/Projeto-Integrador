package projeto.integrador.model;

public class Disciplinas {
    int id;
    String nome;
    String descricao;

    public Disciplinas(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public Disciplinas(int id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "Descrição: " + descricao;
    }
}
