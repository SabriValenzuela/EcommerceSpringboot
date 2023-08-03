package com.grupo1.esenciasspring.Controllers;

import com.grupo1.esenciasspring.Entities.ProductoEntity;
import com.grupo1.esenciasspring.Services.ProductoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    ProductoServiceImpl productoService;

   @GetMapping("/{nombre}")
    public ResponseEntity<ProductoEntity> buscarProductoPorNombre(@PathVariable String nombre) {
      return ResponseEntity.ok(productoService.buscarProductoPorNombre(nombre));
    }


    @GetMapping("/lista")
    public List<ProductoEntity> ListaProductos(){
        return productoService.obtenerProductos();
    }


    @PostMapping("/nuevo")
    public ResponseEntity<ProductoEntity> crearNuevoProducto(@RequestBody ProductoEntity nuevoProducto) {
        return ResponseEntity.ok(productoService.crearNuevoProducto(nuevoProducto));
    }

    @PutMapping ("editar/{id}")
    public ResponseEntity<ProductoEntity> editarProductoPorId(@PathVariable Integer producto_id, @RequestBody ProductoEntity productoEditar)
    {return ResponseEntity.ok(productoService.editarProductoPorId(producto_id, productoEditar));}

    @GetMapping("obtener/{producto_id}")
    private ResponseEntity<ProductoEntity> obtenerProductoPorId(@PathVariable("producto_id") Integer producto_id) {
        ProductoEntity productoElegido = productoService.ObtenerProductoPorId(producto_id);
        return ResponseEntity.ok((ProductoEntity) productoElegido );
    }
    @DeleteMapping("borrar/{producto_id}")
    public void borrarProductoPorId(@PathVariable("producto_id") Integer producto_id)
    { productoService.borrarProductoPorId(producto_id);}

}
