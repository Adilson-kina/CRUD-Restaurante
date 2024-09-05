/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurante;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    public static void main(String[] argv){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String passwd = "1234";

        Connection connection = null;
        
        try {
            connection = DriverManager.getConnection(url, user, passwd);
            System.out.println("Conexão estabelecida com sucesso!");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            if (connection != null) {
                try {
                    connection.close();
                }
                catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static Connection getConnection(){
        return connection;
    }
}
/*
test it later

package Restaurante;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    private static Connection connection = null;

    // Static block to initialize the connection
    static {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Database connection details
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "root";
            String passwd = "1234";
            
            // Establish the connection
            connection = DriverManager.getConnection(url, user, passwd);
            System.out.println("Conexão estabelecida com sucesso!");
        } 
        catch (ClassNotFoundException e) {
            e.printStackTrace();
            // Additional error handling, like logging or rethrowing as a RuntimeException, could be added here
        } 
        catch (SQLException e) {
            e.printStackTrace();
            // Additional error handling, like logging or rethrowing as a RuntimeException, could be added here
        }
    }

    // Method to get the connection
    public static Connection getConnection() {
        return connection;
    }

    // Method to close the connection (if needed)
    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Connection closed.");
            } 
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

*/