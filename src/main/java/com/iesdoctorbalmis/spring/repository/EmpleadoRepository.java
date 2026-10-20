package com.iesdoctorbalmis.spring.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iesdoctorbalmis.spring.entity.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    Optional<Empleado> findByEmail(String email);
    Optional<Empleado> findByNumeroEmpleado(String numeroEmpleado);
    boolean existsByEmail(String email);
    boolean existsByNumeroEmpleado(String numeroEmpleado);
}
