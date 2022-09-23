package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "attestation")
@Getter
@Setter
public class Attestation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne
    private Convention convention;

    @OneToOne
    private Etudiant etudiant;

    private String message;

}








