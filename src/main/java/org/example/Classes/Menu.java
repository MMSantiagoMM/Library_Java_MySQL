package org.example.Classes;

import java.util.Scanner;

public class Menu {

    public static void manuApp(){

        Scanner read = new Scanner(System.in);
        int option;

        do{

            System.out.println("""
                    1.Registrar usuario
                    2.Listar usuarios
                    3.Actualizar datos de usuario
                    4.Borrar datos de usuario
                    5.Salir
                    ---------------------
                    Seleccione una opción""");
                    option = read.nextInt();
                    switch (option){
                        case 1 -> {
                            System.out.println("Registro de usuarios");
                            CustomerService.createCustomer();
                        }
                        case 2 -> System.out.println("Listado de usuarios");
                        case 3 -> System.out.println("Actualizar datos");
                        case 4 -> System.out.println("Borrar usuarios");
                        case 5 -> System.out.println("Salir del sistema");
                        default -> System.out.println("Digite una opción válida");
                    }
        }while(option != 5);
    }
}
