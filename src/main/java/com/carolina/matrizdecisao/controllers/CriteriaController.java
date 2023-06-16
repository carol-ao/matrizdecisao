package com.carolina.matrizdecisao.controllers;

import com.carolina.matrizdecisao.dtos.CriteriaDto;
import com.carolina.matrizdecisao.exceptions.ResourceNotFoundException;
import com.carolina.matrizdecisao.services.CriteriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/criteria")
public class CriteriaController {
    @Autowired
    private CriteriaService criteriaService;

    @PostMapping
    public ResponseEntity<CriteriaDto> create(@RequestParam("matrixId") Long matrixId,
                                              @RequestParam("name") String name,
                                              @RequestParam("weight") Double weight) throws ResourceNotFoundException { //TODO: add @Valid

        return ResponseEntity.ok().body(criteriaService.save(matrixId,name, weight));
    }
}
