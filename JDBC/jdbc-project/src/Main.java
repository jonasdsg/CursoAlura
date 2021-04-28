import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main{
    private static Connection conection;
    public static void main(String[] args) throws SQLException{
        conection = DriverManager.getConnection("jdbc:mysql://localhost/TESTE_?useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
        conection.close();
    }

}
