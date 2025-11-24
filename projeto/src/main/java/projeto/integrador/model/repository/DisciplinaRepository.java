package projeto.integrador.model.repository;

import java.util.List;

import projeto.integrador.model.Disciplinas;
import projeto.integrador.model.daos.DisciplinaDAO;

public class DisciplinaRepository {
    
    private DisciplinaDAO dao;

    public DisciplinaRepository(DisciplinaDAO dao) {
        this.dao = dao;
    }

    public Disciplinas cadastrar(String nome, String descricao) {
        Disciplinas disciplina = new Disciplinas(nome, descricao);
        return dao.salvar(disciplina);
    }

    public List<Disciplinas> listar(int id, String nome, String descricao) {
        return dao.listar();
    }

    public List<Disciplinas> getListar() {
        return null;
    }
    
}
