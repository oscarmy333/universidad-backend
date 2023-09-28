package com.springsimplespasos.universidad.universidadbackend.Exception;

public class ExUtil extends RuntimeException{
    String mensaje;

    public ExUtil(String mensaje){
        super(mensaje);
        this.mensaje=mensaje;
    }

}
