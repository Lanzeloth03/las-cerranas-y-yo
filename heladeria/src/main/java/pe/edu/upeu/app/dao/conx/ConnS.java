/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.dao.conx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hp
 */
public class ConnS {//apenas tenga instancia corre todo

    private static volatile ConnS instance;
    private static volatile Connection connection;

    private ConnS() {//constructor
        try {
            Class.forName("org.sqlite.JDBC");//referenciando 
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnS.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
        if (connection != null) {
            throw new RuntimeException(
                    "Use getConnection() method to create");
        }
    }
//patron singleton: una sola instancia
    public static ConnS getInstance() {
        if (instance == null) {
            synchronized (ConnS.class) {
                if (instance == null) {
                    instance = new ConnS();//instancia con la palabra "new"
                    System.out.println("primera isntancia");
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        if (connection == null) {
            synchronized (ConnS.class) {
                if (connection == null) {
                    try {
                        String dbUrl= "jdbc:sqlite:data/db_ventas.db?foreign_keys=on;";
                        connection= DriverManager.getConnection(dbUrl);//no uso new porque ese metodo es estatico
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return connection;
    }
}
