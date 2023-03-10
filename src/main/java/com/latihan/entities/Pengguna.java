package com.latihan.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Pengguna implements Serializable{

    @Id
    private String id;
    private String password;
    private String nama;
    private String alamat;
    private String email;
    private String nomorHp;
    private String roles;
    private String isAktif;
}
