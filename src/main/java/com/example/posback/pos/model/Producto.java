package com.example.posback.pos.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity // Le dice a Spring que esto es una tabla en la DB
@Table(name = "productos")
@Data   // Genera Getters y Setters automáticamente con Lombok
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String codigoBarras;

    private String nombre;
    private Double precioVenta;
    private Integer stock;
}