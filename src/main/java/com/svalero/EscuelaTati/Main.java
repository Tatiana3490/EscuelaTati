package com.svalero.EscuelaTati;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.svalero.EscuelaTati.Constantes.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola");

        Connection conecction;

        try {
            Class.forName(DRIVER);
            conecction = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
            System.out.println("Se ha conectado con la base de datos");
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
}