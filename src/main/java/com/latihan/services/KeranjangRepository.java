package com.latihan.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.latihan.entities.Keranjang;

public interface KeranjangRepository extends JpaRepository<Keranjang, String>{
    
}
