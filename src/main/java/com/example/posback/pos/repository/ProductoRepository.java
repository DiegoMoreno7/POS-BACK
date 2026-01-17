package com.example.posback.pos.repository;

import com.example.posback.pos.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // Aquí ya tienes métodos como save(), findAll(), deleteById(), etc.
}
