package projeto.integrador.model.repository;

import java.util.List;

import projeto.integrador.model.Topico;
import projeto.integrador.model.daos.TopicoDAO;

public class TopicoRepository {

    TopicoDAO dao;

    public TopicoRepository(TopicoDAO dao){
        this.dao = dao;
    }

    public Topico cadastrar(String titulo, String descricao){
        Topico topico = new Topico(titulo, descricao);
        return dao.salvar(topico);

    }

    public List<Topico> listar(){
        return dao.listarTodos();
    }

    public List<Topico> getListar(){
        return null;
    }
    
}
