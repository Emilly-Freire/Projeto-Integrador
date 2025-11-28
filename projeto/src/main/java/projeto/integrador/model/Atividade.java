package projeto.integrador.model;

import java.time.LocalDate; 

public class Atividade { 
    
    private int idDisciplinaTopicos; 
    private int id;
    private String descricao;
    
    // Mapeamento JDBC: TINYINT é tratado como int
    private int status; // 0 para Pendente, 1 para Concluída
    private LocalDate dataEntrega;

    public Atividade() { 
    }

    public Atividade(int idDisciplinaTopicos, String descricao, int status, LocalDate dataEntrega) {
        this.idDisciplinaTopicos = idDisciplinaTopicos;
        this.descricao = descricao;
        this.status = status;
        this.dataEntrega = dataEntrega;
    }

    public Atividade(int id, int idDisciplinaTopicos, String descricao, int status, LocalDate dataEntrega) {
        this.id = id;
        this.idDisciplinaTopicos = idDisciplinaTopicos;
        this.descricao = descricao;
        this.status = status;
        this.dataEntrega = dataEntrega;
    }

    // --- Getters ---
    public int getId() { 
        return id; 
    }
    public int getIdDisciplinaTopicos() { 
        return idDisciplinaTopicos; 
    }
    public String getDescricao() { 
        return descricao; 
    }
    public int getStatus() { 
        return status; 
    }
    public LocalDate getDataEntrega() { 
        return dataEntrega; 
    }

    // --- Setters ---
    public void setId(int id) { 
        this.id = id; 
    }
    public void setIdDisciplinaTopicos(int idDisciplinaTopicos) { 
        this.idDisciplinaTopicos = idDisciplinaTopicos; 
    }
    public void setDescricao(String descricao) { 
        this.descricao = descricao; 
    }
    public void setStatus(int status) { 
        this.status = status; 
    }
    public void setDataEntrega(LocalDate dataEntrega) { 
        this.dataEntrega = dataEntrega; 
    }

    @Override
    public String toString() {
        return "Descrição: " + descricao + " | Data de Entrega: " + dataEntrega + " | Status: " + (status == 0 ? "Pendente" : "Concluída");
    }
}