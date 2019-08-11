package com.iraheta;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LectorDeDatos {

    public static String solicitarString(String mensaje){

        Scanner lector= new Scanner(System.in);
        System.out.printf(mensaje);
        try {
            String caracter= lector.nextLine();
            return caracter;
        } catch (InputMismatchException e){
            System.out.println("El dato ingresado no es valido");
            return solicitarString(mensaje);
        }

    }
    public static int solicitarEntero(String mensaje){
        Scanner lector= new Scanner(System.in);
        System.out.printf(mensaje);
        try{
            int numero= lector.nextInt();
            return numero;
        }catch (InputMismatchException e){
            System.out.println("El dato ingresado no es valido");
            return solicitarEntero(mensaje);
        }
    }

}
