package com.carlos.supermarket.service;

import java.util.List;

import com.carlos.supermarket.dto.SucursalDTO;

public interface ISucursalService {
    List<SucursalDTO> traerSucursales();
    SucursalDTO crearSucursalDTO(SucursalDTO SucursalDto);
    SucursalDTO actualizarSucursal(Long id, SucursalDTO sucursalDto);
    void eliminarSucursal(Long id);
}
