package com.springsimplespasos.universidad.universidadbackend.modelo.entities;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Alumno;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AlumnoTest {

    Alumno alumno= new Alumno();

    @DisplayName("Comprueba un objeto vacío")
    @Test
    void test_ToString_WhenObjtectToString(){

        String dato = alumno.toString();


        assertThat("Alumno{}".equals(dato));
    }

}
