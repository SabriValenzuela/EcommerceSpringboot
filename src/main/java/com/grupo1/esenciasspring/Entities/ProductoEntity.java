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
    private Integer producto_cantidad;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "Producto_orden",
            joinColumns = @JoinColumn(name = "id_producto", referencedColumnName = "producto_id"),
            inverseJoinColumns = @JoinColumn(name = "idproducto", referencedColumnName = "producto_id"))
    private List<OrdenEntity> OrdenesyProducto;

    @ManyToOne //producto con usuario
    @JoinColumn(name = "usuario_id")
    private UsuarioEntity ProductosDelUsuario;

    @JsonBackReference
    @ManyToOne //producto con inventario
    @JoinColumn(name = "inventario_total")
    private InventarioEntity ProductoDelInventario;
}

