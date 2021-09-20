
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConnectMSSQL {

    public Connection connection;
    static String un;
    static String pwd;

    public static Connection connectDB() {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection;
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=IGDB;selectMethod=cursor", un, pwd);
            return connection;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

}
