/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Daniyal
 */
public class Parameters {
    private final String FILE = "preferences.txt";
    private final String HOST = read("host");
    private final String DATABASE = read("database");
    private final String USER = read("user");
    private final String PASSWORD = read("password");
    
    public String getHOST() {
        return HOST;
    }

    public String getDATABASE() {
        return DATABASE;
    }

    public String getUSER() {
        return USER;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }
      
    public String read(String pref) {
        String ret;
        try {
            Scanner sc = new Scanner(new File(FILE));
            while (sc.hasNextLine()) {
                if (sc.next().equals(pref)) {
                    ret = sc.next();
                    sc.close();
                    return ret;
                }
                sc.next();
            }
            sc.close();
        } catch (FileNotFoundException e) {
            
        }
        return "The Preference you asked doesn't exists";
    }
}
