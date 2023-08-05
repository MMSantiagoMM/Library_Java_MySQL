package org.example.Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionOne {

    //Con este método cme conecto a la base de datos
    public Connection getConnection (){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyLibrary", "root","");
                    if(connection != null){
                        System.out.println("Conexión exitosa");
                    }


        }catch (SQLException e){
            System.out.println(e);
        }

        return connection;
    }
}
