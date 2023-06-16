package com.carolina.matrizdecisao.controllers;

import com.carolina.matrizdecisao.dtos.MatrixDto;
import com.carolina.matrizdecisao.exceptions.ResourceNotFoundException;
import com.carolina.matrizdecisao.services.MatrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/matrix")
public class MatrixController {


    @Autowired
    private MatrixService matrixService;

    @PostMapping
    public ResponseEntity<MatrixDto> create(@RequestParam("name") String name){ //TODO: add @Valid

        return ResponseEntity.ok().body(matrixService.save(name));
    }

    @GetMapping
    public ResponseEntity<MatrixDto> findById(@RequestParam("id") Long id) throws ResourceNotFoundException { //TODO: add @Valid

        return ResponseEntity.ok().body(matrixService.findById(id));
    }
}
