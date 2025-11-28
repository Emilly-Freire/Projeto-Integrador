package projeto.integrador.model.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import projeto.integrador.model.Aluno;
import projeto.integrador.model.FabricaConexoes;


public class JDBCAlunoDAO implements AlunoDAO {
    @Override
    public Aluno salvar(Aluno aluno){
        
        //sql para a tabela ConcluiAi_Usuario
        String sql = "INSERT INTO ConcluiAi_Usuario (nome, email, senha) VALUES (?, ?, ?)";

        try(Connection conn = FabricaConexoes.getInstance().getConnection();
    
            PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getEmail());
            stmt.setString(3, aluno.getSenha());

            stmt.execute();

            //Obter o ID gerado (pkey)
            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    int idGerado = rs.getInt(1);
                    //Setar o id no objeto e retornar
                    aluno.setId(idGerado);
                }
            }
        } catch (Exception e) {
            System.err.println("Erro ao salvar aluno: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
        return aluno;
    }

    //implementar outros métodos crud listar, buscar por id, atualizar, deletar

    @Override
    public List<Aluno> listarTodos(){

        return new ArrayList<>();
    }

    @Override
    public Aluno buscarPorId(int id){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean atualizar(Aluno aluno){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean deletar(int id){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    

    
}
