package projeto.integrador.model.daos;

import java.util.List;

import projeto.integrador.model.Disciplinas;

public interface DisciplinaDAO {
    public Disciplinas cadastrar(String nome, String descricao);
    public List<Disciplinas> listar(int id, String nome, String descricao);
}
