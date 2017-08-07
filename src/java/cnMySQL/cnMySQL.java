
package cnMySQL;

import java.sql.Connection;
import java.sql.DriverManager;


public class cnMySQL {
    Connection connection = null;
    static cnMySQL instance =null;
     
    public cnMySQL() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda","root","");
    }
    public static cnMySQL getInstance() throws Exception{
        if(instance == null){
            instance = new cnMySQL();
        }
        return instance;
    }
    public void finalize() throws Exception{
        if(connection.isClosed()){
            connection = null;
            //connection.isClosed();
        }
    }
    public Connection getConnection(){
        return connection;
    }
    
}
