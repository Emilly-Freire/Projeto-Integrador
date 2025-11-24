package projeto.integrador.model.daos;

public class JDBCDisciplinaDAO implements DisciplinaDAO {
    private FabricaConexoes fabrica;

    public JDBCDisciplinaDAO(FabricaConexoes fabrica) {
        this.fabrica = fabrica;
    }
}
