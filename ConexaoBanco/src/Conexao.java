import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    private static final String url = "jdbc:mysql://52.255.187.179:3306/bd01";
    private static final String user = "brunoguez";
    private static final String pwd = "root";
    private static Connection conn;

    public static Connection getConexao() {
        try {
            if (conn == null) {
                conn = DriverManager.getConnection(url, user, pwd);
                return conn;
            } else {
                return conn;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
