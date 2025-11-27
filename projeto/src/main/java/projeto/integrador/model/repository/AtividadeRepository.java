package projeto.integrador.model.repository;

import java.time.LocalDate;
import java.util.List;
import projeto.integrador.model.Atividade;
import projeto.integrador.model.daos.AtividadeDAO;

public class AtividadeRepository {

    private AtividadeDAO dao;

    public AtividadeRepository(AtividadeDAO dao){
        this.dao = dao;
    }

    public Atividade cadastrar(int id_disciplina_topicos, String descricao, int status, LocalDate data_entrega){
        Atividade atividade = new Atividade(id_disciplina_topicos, descricao, status, data_entrega);
        return dao.salvar(atividade);

    }

    public List<Atividade> listar(){
        return dao.listarTodos();
    }

    public List<Atividade> getListar(){
        return null;
    }
    
}
