package com.grupo1.esenciasspring.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "producto")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ProductoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer producto_id;
    private String producto_nombre;
    private Integer producto_precio;
    private String producto_descripcion;
    private String producto_categoria;
       private Integer producto_stock;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "orden_productos",
            joinColumns = @JoinColumn(name = "id_producto"),
            inverseJoinColumns = @JoinColumn(name = "orden_id"))
    private List<OrdenEntity> OrdenesyProducto;



}


