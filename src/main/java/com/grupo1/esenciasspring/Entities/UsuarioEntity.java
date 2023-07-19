package com.grupo1.esenciasspring.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "usuario")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer usuario_id;
    private String usuario_clave;

@JsonManagedReference
    @OneToMany(mappedBy = "usuarioproducto", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ProductoEntity> productosdelusuario;
@JsonManagedReference
    @OneToMany(mappedBy = "usuarioinventario", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<InventarioEntity> inventariodelusuario;
@JsonManagedReference
    @OneToMany(mappedBy = "usuarioblog", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<BlogEntity> blogdelusuario;

}
