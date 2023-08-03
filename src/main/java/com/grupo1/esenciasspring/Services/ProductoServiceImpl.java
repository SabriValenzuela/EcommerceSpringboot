package com.grupo1.esenciasspring.Services;

import com.grupo1.esenciasspring.Entities.ProductoEntity;
import com.grupo1.esenciasspring.Repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService{
    @Autowired
    ProductoRepository productoRepository;

    @Override
    public ProductoEntity buscarProductoPorNombre(String nombre) {
    return productoRepository.buscarProductoPorNombre(nombre);
    }

@Override
    public List<ProductoEntity> obtenerProductos(){
        List<ProductoEntity> ListaProductos = productoRepository.findAll();
        return ListaProductos;
}

    @Override
    public ProductoEntity crearNuevoProducto(ProductoEntity nuevoProducto) {
        ProductoEntity productoParaGuardar = productoRepository.save(nuevoProducto);
        return productoParaGuardar;
    }

    @Override
    public ProductoEntity editarProductoPorId(Integer producto_id, ProductoEntity productoEditar) {
        Boolean existe = productoRepository.existsById(producto_id);
        if (existe) {
            ProductoEntity productoSeleccionado = productoRepository.findById(producto_id).get();
            productoSeleccionado.setProducto_nombre(productoEditar.getProducto_nombre());
            productoSeleccionado.setProducto_precio(productoEditar.getProducto_precio());
            productoSeleccionado.setProducto_descripcion(productoEditar.getProducto_descripcion());
            productoSeleccionado.setProducto_categoria(productoEditar.getProducto_categoria());
            productoSeleccionado.setProducto_stock(productoEditar.getProducto_stock());
            return productoRepository.save(productoSeleccionado);
        }
        return null;
    }

    @Override
    public ProductoEntity ObtenerProductoPorId(Integer producto_id) {
        return (ProductoEntity) this.productoRepository.findById(producto_id).get();
    }

    @Override
    public void borrarProductoPorId(Integer producto_id) {productoRepository.deleteById(producto_id);}

}




