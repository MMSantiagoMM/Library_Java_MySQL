package org.example.Classes;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface LibraryDAO {
    static void createDB(UsuarioModel cm){
       ConnectionOne dataBase = new ConnectionOne();

       try(Connection connection = dataBase.getConnection()){
           PreparedStatement ps;
        try {
               String query = "INSERT INTO customer (id_doc,doc_type,name,lastName,email,program) VALUES(?,?,?,?,?,?)";
               ps = connection.prepareStatement(query);
               ps.setInt(1,cm.getId_doc());
               ps.setString(2,cm.getDoc_type());
               ps.setString(3,cm.getName());
               ps.setString(4, cm.getLastName());
               ps.setString(5,cm.getEmail());
               ps.setString(6,cm.getProgram());
               ps.executeUpdate();
            System.out.println("Registro exitoso");
           }catch(SQLException exception){
            System.out.println(exception);
        }
       }catch (SQLException e){
           System.out.println(e);
       }

    }
}
