package com.grupo1.esenciasspring.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Table(name = "cliente")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cliente_id;
    private String cliente_direccion;
    private String cliente_correo;
    private String cliente_nombre;
    private String cliente_whatsapp;
    private String cliente_informacion;
    private Integer orden_id;


    @JsonManagedReference
    @OneToMany(mappedBy = "ordendelcliente", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<OrdenEntity> ordenCliente;


}
