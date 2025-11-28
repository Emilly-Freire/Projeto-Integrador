package projeto.integrador.model.repository;

import java.util.List;

import projeto.integrador.model.Disciplina;
import projeto.integrador.model.daos.DisciplinaDAO;

public class DisciplinaRepository {
 
    private DisciplinaDAO dao;
    public DisciplinaRepository(DisciplinaDAO dao) {
        this.dao = dao;
    }

    public Disciplina cadastrar(String nome, String descricao){
        Disciplina disciplina = new Disciplina(nome, descricao);
        return dao.salvar(disciplina);

    }
    public List<Disciplina> listar(){
        return dao.listarTodos();
    }

    public List<Disciplina> getListar(){
        return null;
    }

}
