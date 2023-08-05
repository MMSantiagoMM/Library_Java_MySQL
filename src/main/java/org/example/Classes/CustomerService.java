package org.example.Classes;

import java.util.Scanner;

public class CustomerService {
    static Scanner read = new Scanner(System.in);

    public static void createCustomer(){

        //En esta clase estoy poniendo elementos en los SETs
        UsuarioModel registroUsuario = new UsuarioModel();

        System.out.println("Identificación");
        registroUsuario.setId_doc(read.nextInt());

        System.out.println("Tipo de identificación");
        registroUsuario.setDoc_type(read.next());

        System.out.println("Nombre");
        registroUsuario.setName(read.next());

        System.out.println("Apellido");
        registroUsuario.setLastName(read.next());

        System.out.println("Correo electrónico");
        registroUsuario.setEmail(read.next());

        System.out.println("Programa");
        registroUsuario.setProgram(read.next());

        LibraryDAO.createDB(registroUsuario);

    }
}
