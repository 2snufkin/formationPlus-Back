package com.example.demo.repo;

import com.example.demo.entity.Attestation;
import com.example.demo.entity.Convention;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttestationRepository extends JpaRepository<Attestation, Integer>{

 }
