package com.carlos.supermarket.service;

import java.util.List;

import com.carlos.supermarket.dto.ProductoDTO;

public interface IProductoService {
    List<ProductoDTO> traerProducto();
    ProductoDTO crearProducto(ProductoDTO productoDto);
    ProductoDTO actualizarProducto(Long id, ProductoDTO productoDto);
    void eliminarProducto(Long id);
}
