package com.svalero.EscuelaTati;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola");

        Connection conecction;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conecction = DriverManager.getConnection(
                    "jdbc:oracle:thin:@//localhost:1521/xe",
                    "##Talcubilla", "T1990a4M3");
            System.out.println("Se ha conectado con la base de datos");
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
}