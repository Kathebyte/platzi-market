package com.platzimarket.persistencia.crud;

import com.platzimarket.persistencia.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {
    //@Query(value="SELECT * FROM PRODUCTOS where id_categoria = ?", nativeQuery = true)
    //tambien se puedo usar asi.
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidad_stock,boolean estado);

    Optional<List<Producto>> findByCategoriaOrderByPrecioVentaAsc(int id_categoria);

    List<Producto> findByCantidadStockAndPrecioVentaOrderByCantidadStockAsc(int cantidad_stock,Double precioVenta);


}
