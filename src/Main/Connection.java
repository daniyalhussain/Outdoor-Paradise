/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Daniyal
 */
public class Connection {
    private String host;
    private String database;
    private String user;
    private String password;
    
    private ResultSet rs;
    private int ru;
    private Connection activeConn;
    private Statement statement;
    
    public Connection() {
        init();
    }
    
    private void init() {
        try {
            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        
        Parameters parameters = new Parameters();
        host = parameters.getHOST();
        database = parameters.getDATABASE();
        user = parameters.getUSER();
        password = parameters.getPASSWORD();
    }
    
    public Connection getConnection() throws SQLException {
        if (activeConn == null) {
            init();
            activeConn = createConnection();
        } else if (!activeConn.isValid(0)) {
            activeConn = createConnection();
        }
        return activeConn;
    }

    private Connection createConnection() throws SQLException {
        String connectionString = "jdbc:mysql://" + host + "/" + database + "?"
                + "user=" + user + "&password=" + password;
        return (Connection) DriverManager.getConnection(connectionString);
    }

    public void closeConnection() {
        if (activeConn != null) {
            try {
                activeConn.close();
            } catch (SQLException e) {
                //to catch and do nothing is the best option
                //don't know how to recover from this exception
            } finally {
                activeConn = null;
            }
        }
    }

    public ResultSet queryResultatenSelect(PreparedStatement statement) {
        try {
            rs = statement.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet queryResultatenSelect(String query) {
        try {
            Connection connection;
            connection = getConnection();
            statement =  connection.createStatement();
            rs = statement.executeQuery(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    public int queryResultatenUpdate(PreparedStatement statement) {
        try {
            ru = statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ru;
    }
  
}
