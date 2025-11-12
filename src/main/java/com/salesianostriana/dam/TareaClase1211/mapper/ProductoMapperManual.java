package com.salesianostriana.dam.TareaClase1211.mapper;

import com.salesianostriana.dam.TareaClase1211.DTO.ProductoDTO;
import com.salesianostriana.dam.TareaClase1211.model.Categoria;
import com.salesianostriana.dam.TareaClase1211.model.Producto;

import java.util.List;


public class ProductoMapperManual {

    public ProductoDTO toDTO(Producto producto) {
        return new ProductoDTO(
            producto.getNombre(),
            producto.getDesc(),
            producto.getPvp(),
            producto.getImagenes().getFirst(),
            producto.getCategoria().getNombre()
        );
    }

    public Producto toEntity(ProductoDTO dto) {
        if(dto == null) return null;

        return Producto.builder()
                .nombre(dto.nombre())
                .desc(dto.desc())
                .pvp(dto.pvp())
                .imagenes(List.of(dto.img()))
                .categoria(new Categoria(null, dto.categoria()))
                .build();
    }


}
