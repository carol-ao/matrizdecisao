package com.carolina.matrizdecisao.dtos;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MatrixDto {

    Long Id;
    String name;
    //TODO add set of criteria and options
}
