package com.latihan.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.latihan.entities.Pengguna;

public interface PenggunaRepository extends JpaRepository<Pengguna, String> {
    
}
