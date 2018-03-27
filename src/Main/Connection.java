/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Daniyal
 */
public class Connection {
    private String host;
    private String database;
    private String user;
    private String password;
    
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
  
}
