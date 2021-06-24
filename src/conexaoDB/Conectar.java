/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexaoDB;
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;
/**
 *
 * @author tgabr
 */
public class Conectar {
    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/hoteldb";
    private final String USER = "root";
    private final String PASSWORD = "";
    
    public Connection conexao(){
        java.sql.Connection conecta;
        
        try {
            Class.forName(DRIVER);
            conecta = DriverManager.getConnection(URL, USER, PASSWORD);
            return conecta;
        } catch (Exception e) {
            return null;
        }
    }
}
