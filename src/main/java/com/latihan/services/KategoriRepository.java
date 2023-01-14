package com.latihan.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.latihan.entities.Kategori;

public interface KategoriRepository extends JpaRepository<Kategori, String> {
    
}
