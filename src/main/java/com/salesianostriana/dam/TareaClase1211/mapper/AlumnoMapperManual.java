package com.salesianostriana.dam.TareaClase1211.mapper;

import com.salesianostriana.dam.TareaClase1211.DTO.AlumnoDTO;
import com.salesianostriana.dam.TareaClase1211.model.Alumno;
import lombok.experimental.UtilityClass;

@UtilityClass
public class AlumnoMapperManual {

    public AlumnoDTO toDto(Alumno a) {
        if (a == null) return null;

        return new AlumnoDTO(
                a.getNombre(),
                a.getApellido1() + (" ") + a.getApellido2(),
                a.getTelefono(),
                a.getEmail(),
                a.getDireccion(),
                a.getCurso()
        );





    }

    public Alumno toEntity(AlumnoDTO dto){
        if( dto == null) return null;

        return Alumno.builder()
                .nombre(dto.nombre())
                .apellido1(dto.apellidos().split(" ")[0])
                .apellido2(dto.apellidos().split(" ")[1])
                .telefono(dto.telefono())
                .email(dto.email())
                .direccion(dto.direccion())
                .curso(dto.curso())
                .build();
    }



}
