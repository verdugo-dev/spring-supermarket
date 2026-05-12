package com.carlos.supermarket.service;

import java.util.List;

import com.carlos.supermarket.dto.VentaDTO;

public interface IVentaService {
    List<VentaDTO> traerVentas();
    VentaDTO crearVenta(VentaDTO ventaDto);
    VentaDTO actualizarVenta(Long id, VentaDTO ventaDto);
    void eliminarVenta(Long id);
}
