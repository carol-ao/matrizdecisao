package com.carolina.matrizdecisao.services;


import com.carolina.matrizdecisao.dtos.CriteriaDto;
import com.carolina.matrizdecisao.entities.Criteria;
import com.carolina.matrizdecisao.entities.Matrix;
import com.carolina.matrizdecisao.exceptions.ResourceNotFoundException;
import com.carolina.matrizdecisao.repositories.CriteriaRepository;
import com.carolina.matrizdecisao.repositories.MatrixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CriteriaService {

    @Autowired
    CriteriaRepository criteriaRepository;
    @Autowired
    MatrixRepository matrixRepository;

    public CriteriaDto save(Long matrixId, String name,Double weight) throws ResourceNotFoundException {

        Matrix matrix = matrixRepository.findById(matrixId).orElseThrow( () ->
                new ResourceNotFoundException("Could not find matrix with given id"));

        Criteria criteria = Criteria.builder()
                .name(name)
                .weight(weight)
                .matrix(matrix)
                .build();
        criteria = criteriaRepository.save(criteria);
        return CriteriaDto.builder()
                .id(criteria.getId())
                .name(criteria.getName())
                .matrixId(criteria.getMatrix().getId())
                .build();
    }
}
