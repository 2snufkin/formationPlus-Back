package com.example.demo.repo;

import com.example.demo.entity.Attestation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AttestationRepository extends JpaRepository<Attestation, Integer>{


 @Query("SELECT a  FROM Attestation a WHERE a.etudiant.id = :id")
 Attestation getAttestationByEtudiant_Id(@Param("etudiantId") int id);

 }
