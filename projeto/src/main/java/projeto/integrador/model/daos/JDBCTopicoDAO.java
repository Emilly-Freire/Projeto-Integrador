package projeto.integrador.model.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import projeto.integrador.model.FabricaConexoes;
import projeto.integrador.model.Topico;

public class JDBCTopicoDAO implements TopicoDAO {


    @Override
    public Topico salvar(Topico topico) {
           // sql para tabela ConcluiAi_Topicos
        String sql = "INSERT INTO ConcluiAi_Topicos (titulo, descricao) VALUES (?, ?)";
        

        try (Connection conn = FabricaConexoes.getInstance().getConnection();
             // RETURN_GENERATED_KEYS para obter o ID gerado pelo banco
            PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            
            stmt.setString(1, topico.getTitulo());
            stmt.setString(2, topico.getDescricao());

            stmt.execute();

            // Obter o ID gerado (pkey)
            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    int idGerado = rs.getInt(1);
                    // 4. Setar o id no objeto e retornar
                    topico.setId(idGerado); 
                }
            }
        } catch (Exception e) {
            System.err.println("Erro ao salvar tópico: " + e.getMessage());
            e.printStackTrace();
            return null; 
        }
        return topico;
    }

    @Override
    public List<Topico> listarTodos() {
         return new ArrayList<>(); 
    }

    @Override
    public Topico buscarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean atualizar(Topico topico) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean deletar(int id) {
         throw new UnsupportedOperationException("Not supported yet.");
    }
}
