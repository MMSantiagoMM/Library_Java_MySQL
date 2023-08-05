package org.example;

import org.example.Classes.ConnectionOne;
import org.example.Classes.Menu;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        Menu.manuApp();

        ConnectionOne connectDB = new ConnectionOne();

        try(Connection connect = connectDB.getConnection()){
        }catch (SQLException e){
            System.out.println(e);
        }
    }
}