package com.latihan.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
public class PesananLog {
    
    @Id
    private String id;

    @JoinColumn
    @ManyToOne
    private Pesanan pesanan;

    @JoinColumn
    @ManyToOne
    private Pengguna pengguna;

    private Integer logType;
    private String logMassage;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date waktu;

}
