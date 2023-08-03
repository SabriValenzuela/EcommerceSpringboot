package com.grupo1.esenciasspring.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "orden")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class OrdenEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orden_id;
    private Integer orden_cantidaddeproducto;
    private Integer orden_total;
    private Date orden_fecha;



    @CreationTimestamp//Indica que el atributo siguiente es una fecha de creación
    private LocalDateTime createdAt;

    @OneToOne
    private ComprobantedepagoEntity comprobantedepagoEntity;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name= "cliente_id")
    private ClienteEntity ordendelcliente;

@ManyToMany
    @JoinTable(name = "orden_productos", joinColumns = @JoinColumn(name = "orden_id"),
    inverseJoinColumns = @JoinColumn(name = "id_producto"))
    private List<ProductoEntity> productosOrden;

}
