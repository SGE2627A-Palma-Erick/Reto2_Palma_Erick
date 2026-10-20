package com.iesdoctorbalmis.spring.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iesdoctorbalmis.spring.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    Optional<Cliente> findByEmail(String email);
    Optional<Cliente> findByCodigoCliente(String codigoCliente);
    boolean existsByEmail(String email);
    boolean existsByCodigoCliente(String codigoCliente);
}
