package com.iraheta;

public class Turista {

    private String nombre;
    private String telefono;
    public int numeroDeVisitas;

    public int getNumeroDeVisitas() {
        return numeroDeVisitas;
    }
    public void setNumeroDeVisitas(int numeroDeVisitas) {
        this.numeroDeVisitas = numeroDeVisitas + this.numeroDeVisitas;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre)throws ErrorValidacion {
        if(nombre.length()>50){
            throw new ErrorValidacion("El nombre no es valido");
        }
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) throws ErrorValidacion {
        if(!telefono.matches("^[0-9]{4}\\-?[0-9]{4}")){
            throw new ErrorValidacion("El número de teléfono no es valido");
        }
        this.telefono = telefono;
    }
}
