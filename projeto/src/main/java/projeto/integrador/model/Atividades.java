package projeto.integrador.model;

public class Atividades {
    int id;
    String descricao;
    boolean status;
    String dataEntrega;

    public Atividades(String descricao, boolean status, String dataEntrega) {
        this.descricao = descricao;
        this.status = status;
        this.dataEntrega = dataEntrega;
    }

    public Atividades(int id, String descricao, boolean status, String dataEntrega) {
        this.id = id;
        this.descricao = descricao;
        this.status = status;
        this.dataEntrega = dataEntrega;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean getStatus() {
        return status;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }
}
