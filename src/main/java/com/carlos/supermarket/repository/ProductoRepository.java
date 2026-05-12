package com.carlos.supermarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos.supermarket.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
