package projeto.integrador.model.daos;

import java.util.List;

import projeto.integrador.model.Topico;

public interface TopicoDAO {

    // Crud
    Topico salvar(Topico topico);
    
    List<Topico> listarTodos();
    
    Topico buscarPorId(int id); 

    boolean atualizar(Topico topico);

    boolean deletar(int id);
}