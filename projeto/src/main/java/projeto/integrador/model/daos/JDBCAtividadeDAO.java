package projeto.integrador.model.daos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import projeto.integrador.model.Atividade;
import projeto.integrador.model.FabricaConexoes;

public class JDBCAtividadeDAO implements AtividadeDAO {
    

    @Override
    public Atividade salvar(Atividade atividade) {

        // sql para tabela ConcluiAi_Atividades
        String sql = "INSERT INTO ConcluiAi_Atividades (id_disciplina_topicos, descricao, status, data_entrega) VALUES (?, ?, ?, ?)";
        

        try (Connection conn = FabricaConexoes.getInstance().getConnection();
             // RETURN_GENERATED_KEYS para obter o ID gerado pelo banco
            PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setInt(1, atividade.getIdDisciplinaTopicos());
            stmt.setString(2, atividade.getDescricao());
            stmt.setInt(3, atividade.getStatus());
            stmt.setDate(4, Date.valueOf(atividade.getDataEntrega()));

            stmt.execute();

            // Obter o ID gerado (pkey)
            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    int idGerado = rs.getInt(1);
                    // 4. Setar o id no objeto e retornar
                    atividade.setId(idGerado); 
                }
            }
        } catch (Exception e) {
            System.err.println("Erro ao salvar atividade: " + e.getMessage());
            e.printStackTrace();
            return null; 
        }
        return atividade;
    }

    

    @Override
    public List<Atividade> listarTodos() {
        return new ArrayList<>(); 
    }

    @Override
    public Atividade buscarPorId(int id) {
       throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean atualizar(Atividade atividade) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean deletar(int id) {
       throw new UnsupportedOperationException("Not supported yet.");
    }
}
