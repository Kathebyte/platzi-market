package com.platzimarket.persistencia.entity;

import jakarta.persistence.*;

import javax.print.DocFlavor;
import java.time.LocalDateTime;

@Entity
@Table (name="COMPRAS")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO.IDENTITY)
    @Column(name="id_compra")
    private Integer idCompra;

    @Column(name="id_cliente")
    private String idCliente;


    private LocalDateTime fecha;

    @Column(name="medio_pago")
    private String medioPago;

    private String comentarios;

    private String estado;


}
