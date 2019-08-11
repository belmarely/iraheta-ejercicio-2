package com.iraheta;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Turista> turistas = new ArrayList();
        Scanner lector= new Scanner(System.in);
        System.out.println("****************************************");
        System.out.println("\tBenvenido a Control de Visitas");
        System.out.println("****************************************");

        boolean continuar = true;
        while (continuar) {
            System.out.println("");
            System.out.println("1. Nuevo Registro");
            System.out.println("2. Mostrar todos los Registros");
            System.out.println("3. Salir del Sistema");
            System.out.println("");
            int opcion= LectorDeDatos.solicitarEntero("Ingrese una opción ");
            switch (opcion){
                case 1:
                    System.out.println("Registre al visitante del turista");
                    String nombre= LectorDeDatos.solicitarString("Ingrese el nombre: ");
                    String telefono= LectorDeDatos.solicitarString("Ingrese el teléfono: ");
                    System.out.println("");

                    Turista nuevoTurista= new Turista();
                    try{
                        nuevoTurista.setNombre(nombre);
                        nuevoTurista.setTelefono(telefono);
                    } catch (ErrorValidacion e) {
                        System.err.println(e.getMessage());
                    }
                    int turista=1;
                    nuevoTurista.setNumeroDeVisitas(turista);
                    int i=-1;
                    int contador=0;
                    if(!turistas.isEmpty()) {
                        for (Turista c : turistas) {
                            if (c.getTelefono().equals(telefono)) {
                                System.out.println("");
                                System.out.println("Se ha registrado con Éxito");
                                System.out.println("");
                                i = contador;
                            }
                            contador++;
                        }
                    }
                    if (i!=-1) {
                        turistas.get(i).setNumeroDeVisitas(turista);
                    } else {
                        if (nuevoTurista.getTelefono()!=null && nuevoTurista.getNombre()!=null) {
                            turistas.add(nuevoTurista);
                            System.out.println("");
                            System.out.println("Registro ingresado con éxito");
                            System.out.println("");
                        }else{
                            System.out.println("");
                            System.out.println("Datos incorrectos");
                            System.out.println("");
                        }
                    }
                    break;
                case 2:
                    if(turistas.isEmpty()){
                        System.out.println("No hay registros de visitas");
                        System.out.println("");
                    } else{
                        System.out.println("Mostrando todos los registros de visita: ");
                        System.out.println("");
                        int contador1=1;
                        for (Turista c : turistas) {
                            System.out.println(contador1 + " El turista: " + c.getNombre() +" con el Telefono: " + c.getTelefono() +" total de visitas: " + c.getNumeroDeVisitas());
                            contador1++;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Salir del sistema de Visita de Turista");
                    continuar=false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }

    }

}
