package com.iesdoctorbalmis.spring.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iesdoctorbalmis.spring.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    Optional<Producto> findByReferencia(String referencia);
    boolean existsByReferencia(String referencia);
}
