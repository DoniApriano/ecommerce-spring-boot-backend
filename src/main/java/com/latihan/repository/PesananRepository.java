package com.latihan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.latihan.entities.Pesanan;

public interface PesananRepository extends JpaRepository<Pesanan, String> {
    
}
