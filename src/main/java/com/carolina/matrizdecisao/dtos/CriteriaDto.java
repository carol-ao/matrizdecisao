package com.carolina.matrizdecisao.dtos;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CriteriaDto {

    private Long id;
    private String name;
    private Long matrixId;
}
