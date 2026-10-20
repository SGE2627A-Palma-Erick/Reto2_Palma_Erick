package com.iesdoctorbalmis.spring.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "productos")
@Data 
@NoArgsConstructor 
@AllArgsConstructor 
public class Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "referencia", nullable = false, unique = true, length = 50)
    private String referencia;
    
    @Column(nullable = false, length = 200)
    private String descripcion;
    
    @Column(name = "precio_venta", nullable = false, precision = 10, scale = 2)
    private BigDecimal precioVenta;
    
    @Column(name = "precio_coste", nullable = false, precision = 10, scale = 2)
    private BigDecimal precioCoste;
    
    @Column(name = "stock", nullable = false)
    private Integer stock;
    
    @Column(name = "fecha_alta", nullable = false)
    private LocalDate fechaAlta;
    
    @Column(name = "activo", nullable = false)
    private Boolean activo;
}
