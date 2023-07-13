package com.grupo1.esenciasspring.Services;

import com.grupo1.esenciasspring.Entities.ProductoEntity;

import java.util.List;

public interface ProductoService {


    ProductoEntity buscarProductoPorNombre(String nombre);


    List<ProductoEntity> ListaDeProductos();
}
