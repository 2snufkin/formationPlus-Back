package com.example.demo.service;

import com.example.demo.entity.Attestation;
import com.example.demo.entity.Convention;
import com.example.demo.entity.Etudiant;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class AttestationServiceTest {

    private final AttestationService attestationService;

    AttestationServiceTest(AttestationService attestationService) {
        this.attestationService = attestationService;
    }


    @Test
    void saveAttestation() {
        Attestation att = new Attestation();
        Etudiant etud = new Etudiant();
        Convention convention = new Convention();
        convention.setNom("HL4");
        convention.setNombreHeures(15);
        etud.setMail("etud@gmail.fr");
        etud.setNom("Rolland");
        etud.setPrenom("Roy");
        att.setMessage("comment");
        //......
        var assFromDB = attestationService.saveAttestation(att);

        Assertions.assertNotNull(assFromDB);
    }
}