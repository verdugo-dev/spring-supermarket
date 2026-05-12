package com.carlos.supermarket.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.carlos.supermarket.dto.SucursalDTO;

@Service
public class SucursalService implements ISucursalService {

    @Override
    public List<SucursalDTO> traerSucursales() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'traerSucursales'");
    }

    @Override
    public SucursalDTO crearSucursalDTO(SucursalDTO SucursalDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearSucursalDTO'");
    }

    @Override
    public SucursalDTO actualizarSucursal(Long id, SucursalDTO sucursalDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarSucursal'");
    }

    @Override
    public void eliminarSucursal(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarSucursal'");
    }

}
