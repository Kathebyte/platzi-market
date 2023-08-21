package com.platzimarket.persistencia.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "CLIENTES")
public class Cliente {

    @Id
    private Integer id;
    private String name;
    private String apellidos;
    private String celular;
    private String direccion;
    @Column(name = "correo_electronico)")
    private String correoElectronico;

    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;


}
