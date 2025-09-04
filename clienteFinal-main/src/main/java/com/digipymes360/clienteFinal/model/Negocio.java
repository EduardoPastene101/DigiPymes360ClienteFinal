package com.digipymes360.clienteFinal.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@Table(name = "Negocio")
@Entity
@NoArgsConstructor
@Getter
@Setter
public class Negocio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_negocio;

    @Column
    private String nombre;

    @Column
    private String descripcion;

    @Column
    private String img_url;

}
