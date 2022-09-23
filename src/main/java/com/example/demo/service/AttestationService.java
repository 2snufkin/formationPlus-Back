package com.example.demo.service;

import com.example.demo.entity.Attestation;
import com.example.demo.repo.AttestationRepository;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public class AttestationService {
//    le test se trouve ici: src/test/java/com/example/demo/service/AttestationServiceTest.java
    private final AttestationRepository attestationRepository;

    public Attestation saveAttestation(Attestation attestation) {
        return attestationRepository.save(attestation);
    }

}
