package kh.com.wa.rest.controller;

import kh.com.wa.data.jpa.enity.Pet;
import kh.com.wa.rest.service.PetServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PetController {

    private final PetServices services;

    @GetMapping("/pet")
    public ResponseEntity<?> getAllPet(){
       return new ResponseEntity<>(services.getAllPet(),null, HttpStatus.OK);
    }
}
