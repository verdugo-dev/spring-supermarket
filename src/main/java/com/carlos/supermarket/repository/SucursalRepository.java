package com.carlos.supermarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos.supermarket.model.Sucursal;

public interface SucursalRepository extends JpaRepository<Sucursal, Long> {

}
