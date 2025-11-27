package projeto.integrador.model.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import projeto.integrador.model.Disciplina;
import projeto.integrador.model.FabricaConexoes; 

public class JDBCDisciplinaDAO implements DisciplinaDAO {

    
    @Override
    public Disciplina salvar(Disciplina disciplina) {
        // SQL para a tabela ConcluiAi_Disciplinas 
        String sql = "INSERT INTO ConcluiAi_Disciplinas (nome, descricao) VALUES (?, ?)";
        

        try (Connection conn = FabricaConexoes.getInstance().getConnection();
             // RETURN_GENERATED_KEYS para obter o ID gerado pelo banco
            PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, disciplina.getNome());
            stmt.setString(2, disciplina.getDescricao());

            stmt.execute();

            // Obter o ID gerado (pkey)
            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    int idGerado = rs.getInt(1);
                    // 4. Setar o id no objeto e retornar
                    disciplina.setId(idGerado); 
                }
            }
        } catch (Exception e) {
            System.err.println("Erro ao salvar disciplina: " + e.getMessage());
            e.printStackTrace();
            return null; 
        }
        return disciplina;
    }

    //implementar os outros métodos CRUD listarTodos, buscarPorId, atualizar e deletar.
    
    @Override
    public List<Disciplina> listarTodos() {
        
        return new ArrayList<>(); 
    }

    @Override
    public Disciplina buscarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean atualizar(Disciplina disciplina) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean deletar(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}