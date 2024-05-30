package jdbcdemoday11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcdemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String driverClassName = "";
        String url = "";
        String username = "";
        String pass = "";
        String query = "";

        // Load the driver
        Class.forName(driverClassName); 

        // Create a connection
        Connection conn = DriverManager.getConnection(url, username, pass);

        // Prepare a statement --> query to exec
        Statement st = conn.createStatement();
        int count = st.executeUpdate(query);

        System.out.println("Rows effected: " + count);
        conn.close();
    }
    
}
