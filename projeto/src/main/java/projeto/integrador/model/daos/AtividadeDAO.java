package projeto.integrador.model.daos;

import java.util.List;

import projeto.integrador.model.Atividade;

public interface AtividadeDAO {
    
    // Crud
    Atividade salvar(Atividade atividade);

    List<Atividade> listarTodos();

    Atividade buscarPorId(int id); 

    boolean atualizar(Atividade atividade);

    boolean deletar(int id);
}