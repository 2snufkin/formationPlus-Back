package com.example.demo.controller;

import com.example.demo.entity.Attestation;
import com.example.demo.service.AttestationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/attestation")
@RequiredArgsConstructor
public class CheckoutController {

    private final AttestationService attestationService;

    @PostMapping("/purchase")
    public ResponseEntity<Attestation> placeOrder(@RequestBody Attestation attestation) {
        Attestation attestationRes = attestationService.saveAttestation(attestation);
        //Dans une vraie application je vais avoir de Mapper qui transform l'entity en DTO et je vair renvoyer un DTO
        return new ResponseEntity<>(attestationRes, HttpStatus.OK);
    }

}









