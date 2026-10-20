package com.iesdoctorbalmis.spring.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity //Marca una clase como entidad
@Table(name = "clientes", uniqueConstraints = {//Da el nombre de la tabla
    @UniqueConstraint(columnNames = "codigo_cliente"),
    @UniqueConstraint(columnNames = "email")
})
@Data //Genera get,set, toString, hashCode
@NoArgsConstructor //Genera constructor vacio
@AllArgsConstructor //Genera constructor con todos los parametros
//Es lombok, te permite ahorrarte todo ese codigo
public class Cliente {

    @Id//Clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Especifica como se genera el ID
    private Long id;

    @Column(name = "codigo_cliente", nullable = false, length = 50)//Configura los detalles de la columna
    private String codigoCliente;
    
    @Column(nullable = false, length = 100)
    private String nombre;
    
    @Column(unique = true, nullable = false, length = 100)
    private String email;
    
    @Column(length = 20)
    private String telefono;
    
    @Enumerated(EnumType.STRING)//Mapea un enum a una columna
    @Column(name = "tipo_cliente", nullable = false)
    private TipoCliente tipoCliente;
    
    @Column(name = "fecha_alta", nullable = false)
    private LocalDate fechaAlta;
    
    @Column(name = "fecha_modificacion")
    private LocalDate fechaModificacion;
}
