import java.sql.PreparedStatement;

public class UsuarioDAO {
    public void cadastrarUsuario(Usuario Usuario) {
        //String sql = "INSERT INTO USUARIO(NOME, USUARIO, SENHA, EMAIL) VALUES("+"Eduardo"+","+"etda"+","+"123"+","+"etda@etda.com"+")";
        String sql = "INSERT INTO usuario(NOME, USUARIO, SENHA, EMAIL) VALUES(?,?,?,?)";
        PreparedStatement ps = null;
        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, Usuario.getNome());
            ps.setString(2, Usuario.getUsuario());
            ps.setString(3, Usuario.getSenha());
            ps.setString(4, Usuario.getEmail());
            ps.execute();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
