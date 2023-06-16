package com.carolina.matrizdecisao.services;

import com.carolina.matrizdecisao.dtos.MatrixDto;
import com.carolina.matrizdecisao.entities.Matrix;
import com.carolina.matrizdecisao.exceptions.ResourceNotFoundException;
import com.carolina.matrizdecisao.repositories.CriteriaRepository;
import com.carolina.matrizdecisao.repositories.MatrixRepository;
import com.carolina.matrizdecisao.repositories.OptionRepository;
import com.carolina.matrizdecisao.repositories.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatrixService {

    @Autowired
    private MatrixRepository matrixRepository;
    @Autowired
    private CriteriaRepository criteriaRepository;
    @Autowired
    private OptionRepository optionRepository;
    @Autowired
    private ScoreRepository scoreRepository;

    public MatrixDto save(String name){

        Matrix newMatrix = Matrix.builder().name(name).build();
        newMatrix = matrixRepository.save(newMatrix);
        return MatrixDto.builder().Id(newMatrix.getId()).name(newMatrix.getName()).build();
    }

    public MatrixDto findById(Long id) throws ResourceNotFoundException {
        Matrix matrix =  matrixRepository.findById(id).orElseThrow( () ->
                new ResourceNotFoundException("Could not find matrix with given id"));
        return MatrixDto.builder()
                .Id(matrix.getId())
                .name(matrix.getName())
                .build();
    }

    //findByName

    public List<Matrix> findAll(String name){ //add pageable
        return matrixRepository.findAll();
    }

    public void delete(Long id) throws ResourceNotFoundException {
        //TODO: delete options and criteria first
        Matrix matrix = matrixRepository.findById(id).orElseThrow( () ->
                new ResourceNotFoundException("Could not find matrix with given id"));
        matrixRepository.delete(matrix);
    }
}
