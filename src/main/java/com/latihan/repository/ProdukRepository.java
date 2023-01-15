package com.latihan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.latihan.entities.Produk;

public interface ProdukRepository extends JpaRepository<Produk, String>{
    
}
