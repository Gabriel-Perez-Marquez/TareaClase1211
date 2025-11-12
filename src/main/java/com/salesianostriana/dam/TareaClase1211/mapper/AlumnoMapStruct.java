package com.salesianostriana.dam.TareaClase1211.mapper;

import com.salesianostriana.dam.TareaClase1211.DTO.AlumnoDTO;
import com.salesianostriana.dam.TareaClase1211.model.Alumno;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AlumnoMapStruct {

    @Mapping(target = "apellidos", expression = "java(alumno.getApellido1() + \" \" + alumno.getApellido2())" )
    AlumnoDTO toDto(Alumno alumno);

    @Mapping(target = "apellido1", expression = "java(dto.apellidos().split(\" \")[0])")
    @Mapping(target = "apellido2", expression = "java(dto.apellidos().slipt(\" \")[1])")
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "telefono", ignore = true)
    Alumno toEntity(AlumnoDTO dto);



}
