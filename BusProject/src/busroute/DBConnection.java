package busroute;


import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getDBConnection() {
        Connection connection;
        try {
         //   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      Class.forName("com.mysql.jdbc.Driver");

             System.out.println("JDBC-ODBC driver loaded ok.");


   //        connection = DriverManager.getConnection("jdbc:odbc:Bus");
             connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bus","root","123456");



          System.out.println("DSN Connection ok.");

            return connection;
        } catch (Exception ex) {
            System.out.println(ex);


            return null;
        }//try catch closed
    }//getDBConnection() closed
}//class closed
