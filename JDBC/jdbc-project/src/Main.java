import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main{
    private static Connection conection;
    public static void main(String[] args) throws SQLException{
        conection = DriverManager.getConnection("jdbc:mysql://localhost/TESTE_?useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
        Statement  stmt =  conection.createStatement();
        stmt.execute("SELECT * FROM ALUNO");

        ResultSet rset = stmt.getResultSet();
        while(rset.next()){
            String aluno = rset.getString("NOME_ALUNO");
            String id = rset.getString("ID_ALUNO");
            System.out.println("O aluno: "+aluno+"  possui o id "+id);
        }
        conection.close();
    }

}
