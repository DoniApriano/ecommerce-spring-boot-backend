package com.latihan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.latihan.entities.Pengguna;

public interface PenggunaRepository extends JpaRepository<Pengguna, String> {
    
}
