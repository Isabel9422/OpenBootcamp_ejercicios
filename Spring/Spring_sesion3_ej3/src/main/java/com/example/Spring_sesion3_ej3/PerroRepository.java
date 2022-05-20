package com.example.Spring_sesion3_ej3;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerroRepository extends JpaRepository<Perro,Integer> {
}
