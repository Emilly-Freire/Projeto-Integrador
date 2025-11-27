package projeto.integrador.model.daos;

import java.util.List;

import projeto.integrador.model.Disciplina;

public interface DisciplinaDAO {
    
    // Crud
    Disciplina salvar(Disciplina disciplina); 
    
    List<Disciplina> listarTodos();
    
    Disciplina buscarPorId(int id); 

    boolean atualizar(Disciplina disciplina);

    boolean deletar(int id);
}