package com.iesdoctorbalmis.spring.entity;

public enum TipoCliente{
    PROSPECTO("Cliente Potencial"),
    ACTIVO("Cliente Activo"),
    INACTIVO("Cliente Inactivo");

    private final String descripcion;
    
    TipoCliente(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
}
