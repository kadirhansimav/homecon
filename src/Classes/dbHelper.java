package Classes;

 
import java.sql.*;


/**
 *
 * @author kadir
 */
public class dbHelper {

   private String ConUrl = "jdbc:sqlite:C:/sqlite/deneme.db";
   public Connection getConnection() throws SQLException{
       return DriverManager.getConnection(ConUrl);
   }
   public void showErrorMessage(SQLException e){
       System.out.println("Error:"+e.getMessage());
   }
}
