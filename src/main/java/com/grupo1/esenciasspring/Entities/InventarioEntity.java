package com.grupo1.esenciasspring.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "inventario")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class InventarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer inventario_total;
    private Integer producto_id;
    private Integer producto_cantidad;
}
