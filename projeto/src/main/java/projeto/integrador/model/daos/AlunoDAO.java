package projeto.integrador.model.daos;

import java.util.List;

import projeto.integrador.model.Aluno;

public interface AlunoDAO {

    //crud 
    Aluno salvar(Aluno aluno);

    List<Aluno> listarTodos();

    Aluno buscarPorId(int id);

    boolean atualizar(Aluno aluno);

    boolean deletar(int id);

}
