package com.salesianostriana.dam.TareaClase1211.DTO;

import com.salesianostriana.dam.TareaClase1211.model.Curso;
import com.salesianostriana.dam.TareaClase1211.model.Direccion;

public record AlumnoDTO(String nombre, String apellidos, String telefono, String email, Direccion direccion, Curso curso) {
}

