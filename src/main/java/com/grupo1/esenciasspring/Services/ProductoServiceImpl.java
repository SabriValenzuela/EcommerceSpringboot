package com.grupo1.esenciasspring.Services;

import com.grupo1.esenciasspring.Entities.ProductoEntity;
import com.grupo1.esenciasspring.Repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService{
    @Autowired
    ProductoRepository productoRepository;

    @Override
    public ProductoEntity buscarProductoPorNombre(String nombre) {
        return productoRepository.buscarProductoPorNombre(nombre);
    }


    @Override
    public List<ProductoEntity> ListaDeProductos(){return productoRepository.findAll();}


}
