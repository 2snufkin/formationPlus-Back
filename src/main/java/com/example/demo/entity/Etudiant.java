package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "etudiant")
@Getter
@Setter
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;

    private String prenom;

    private String mail;


    @OneToOne
    @PrimaryKeyJoinColumn
    private Convention convection;
}





