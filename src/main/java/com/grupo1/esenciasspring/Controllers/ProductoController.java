package com.grupo1.esenciasspring.Controllers;

import com.grupo1.esenciasspring.Entities.ProductoEntity;
import com.grupo1.esenciasspring.Services.ProductoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ResponseEntity<List<ProductoEntity>> ListaDeProductos(){
        return ResponseEntity.ok(productoService.ListaDeProductos());
    }

}
