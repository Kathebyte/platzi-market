package com.platzimarket.persistencia.entity;

import jakarta.persistence.*;

import javax.print.DocFlavor;
import java.time.LocalDateTime;
import java.util.List;

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

    @ManyToOne
    @JoinColumn(name = "id_cliente", insertable = false,updatable = false)
    private Cliente cliente;
    @OneToMany(mappedBy = "producto")
    private List<CompraProducto> productos;


    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
