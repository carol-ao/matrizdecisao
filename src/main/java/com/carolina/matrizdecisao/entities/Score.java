package com.carolina.matrizdecisao.entities;

import com.carolina.matrizdecisao.entities.pk.ScorePk;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Score {

    @EmbeddedId
    private ScorePk id;
    private Double absoluteValue;

}
