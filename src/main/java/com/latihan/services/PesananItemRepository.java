package com.latihan.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.latihan.entities.PesananItem;

public interface PesananItemRepository extends JpaRepository<PesananItem, String> {
    
}
