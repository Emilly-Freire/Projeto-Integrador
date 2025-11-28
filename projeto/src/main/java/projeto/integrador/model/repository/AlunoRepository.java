package projeto.integrador.model.repository;

import java.util.List;

import projeto.integrador.model.Aluno;
import projeto.integrador.model.daos.AlunoDAO;

public class AlunoRepository {
    
    private AlunoDAO dao;

    public AlunoRepository(AlunoDAO dao){
        this.dao = dao;
    }

    public Aluno cadastar(String nome, String email, String senha){
        Aluno aluno = new Aluno(nome, email, senha);
        return dao.salvar(aluno);
    }

    public List<Aluno> listar(){
        return dao.listarTodos();
    }

    public List<Aluno> getListar(){
        return null;
    }

}
